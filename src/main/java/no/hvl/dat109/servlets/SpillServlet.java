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
import no.hvl.dat109.spillWeb.YatzyWeb;

/**
 * 
 * @author Birk Johannessen
 *
 *Spillets gang!
 *spillServlet kommer med en spillID som ligger i get requesten. dette blir brukt mot databasen for å avgjøre hvilket spill som spilles
 *
 *spilleren blir sendt til en venteside frem til det er hans tur.
 *
 *når det er spillerens tur er det endel spilllogikk som blir sendt gjennom post opp mot database for å summere en runde.
 */


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
			if(YatzyWeb.aktuellSpillersTur(spillerDAO, spillID).equals(request.getSession().getAttribute("mobil"))) {
				
				if(request.getSession().getAttribute("kastNr")==null||(int)request.getSession().getAttribute("kastNr")==0) {
					request.getSession().setAttribute("kastNr", 0);
					ArrayList<Integer> kopp = Terning.trillTerninger();
					request.getSession().setAttribute("kopp", kopp);
				}
				request.getRequestDispatcher("WEB-INF/jsp/Spill.jsp").forward(request, response);
			}else {
				//han må vente til neste spiller er ferdig Kanskje fint med tabell?
				request.getRequestDispatcher("WEB-INF/jsp/SpillVent.jsp").forward(request, response);
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
				int runde = YatzyWeb.getRunde(spillerDAO, spillID);
				spillerDAO.setScore(spillID, runde, YatzyWeb.getSum(runde,kopp), (String)request.getSession().getAttribute("mobil"));
				request.getSession().setAttribute("kastNr", 0);
				request.getSession().setAttribute("kopp", kopp);
				response.sendRedirect("SpillServlet?spillID="+spillID);
			}
		}
	}

}
