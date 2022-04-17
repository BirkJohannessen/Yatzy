package no.hvl.dat109.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat109.BackendUtils.LoginUtil;
import no.hvl.dat109.dao.SpillerDAO;
import no.hvl.dat109.spill.Spiller;
import no.hvl.dat109.spill.Terning;
import spillWeb.YatzyWeb;

@WebServlet("/SpillServlet")
public class SpillServlet extends HttpServlet {
	
	@EJB
	private SpillerDAO spillerDAO;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!LoginUtil.erInnlogget(request)) {
			response.sendRedirect("LoginnServlet?f1=timeout");
		}else {
			String spillID = request.getParameter("spillID");
			if(YatzyWeb.aktuellSpillersTur(spillerDAO, spillID).equals(request.getSession().getAttribute("mobil"))) { //TODO riktig skjekk av riktig spiller
				
				if(request.getSession().getAttribute("kastNr")==null||(int)request.getSession().getAttribute("kastNr")==0) {
					request.getSession().setAttribute("kastNr", 0);
					ArrayList<Integer> kopp = Terning.trillTerninger();
					request.getSession().setAttribute("kopp", kopp);
				}
				request.getRequestDispatcher("WEB-INF/jsp/Spill.jsp").forward(request, response);
			}else {
				//han må vente til neste spiller er ferdig
				request.getRequestDispatcher("WEB-INF/jsp/SpillVent.jsp").forward(request, response); //TODO - lag spillerventer som viser tabell og forje kast
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!LoginUtil.erInnlogget(request)) {
			response.sendRedirect("LoginnServlet?f1=timeout");
		}else {
			String spillID = request.getParameter("spillID");
			ArrayList<Integer> kopp = (ArrayList<Integer>) request.getSession().getAttribute("kopp");
			int kastNr = (int) request.getSession().getAttribute("kastNr");
			if(kastNr<1) {
				kastNr++;
				kopp = YatzyWeb.oppdaterKopp(request, kopp);
				request.getSession().setAttribute("kopp", kopp);
				request.getSession().setAttribute("kastNr", kastNr);
				response.sendRedirect("SpillServlet?spillID="+spillID);
			}else {
				int runde = YatzyWeb.getRunde(spillerDAO.hentSpillTilstand(spillID));
				spillerDAO.setScore(spillID, runde, YatzyWeb.getSum(runde,kopp), (String)request.getSession().getAttribute("mobil"));
				request.getSession().setAttribute("kastNr", 0);
				request.getSession().setAttribute("kopp", kopp);
				response.sendRedirect("SpillServlet?spillID="+spillID);
			}
		}
	}

}
