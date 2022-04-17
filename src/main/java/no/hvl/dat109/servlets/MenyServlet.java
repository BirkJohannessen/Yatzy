package no.hvl.dat109.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.persistence.internal.oxm.schema.model.List;

import no.hvl.dat109.BackendUtils.LoginUtil;
import no.hvl.dat109.dao.SpillerDAO;

/**
 * 
 * @author Birk Johannessen
 * 
 * Meny for Yatzy
 * 
 * her kan endebrukeren velge å observere/se gammelt spilltilstand
 * 
 * eller starte et nytt spill
 *
 */

@WebServlet(name = "MenyServlet", urlPatterns = { "/Meny" })
public class MenyServlet extends HttpServlet {
	
	@EJB
	private SpillerDAO spillerDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!LoginUtil.erInnlogget(request)) {
			response.sendRedirect("LoginServlet?f1=Det er kun registrerte brukere som kan se Meny");
		}else {
			request.getRequestDispatcher("WEB-INF/jsp/Meny.jsp").forward(request, response);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!LoginUtil.erInnlogget(request)) {
			response.sendRedirect("LoginServlet?f1=Det er kun registrerte brukere som kan se Meny");
		}else {
			int caseID = Integer.parseInt(request.getParameter("query"));
			
			switch(caseID) {
			case 1:
				String spillID = request.getParameter("spillID");
				response.sendRedirect("spillServlet?spillID="+spillID);
				break;
			case 2:
				String[] spillere = new String[5];
				spillere[0] = (String) request.getSession().getAttribute("mobil");
				spillere[1] = request.getParameter("spiller2");
				spillere[2] = request.getParameter("spiller3");
				spillere[3] = request.getParameter("spiller4");
				spillere[4] = request.getParameter("spiller5");
				spillere[5] = request.getParameter("spiller6");
				String newSpillID = spillerDAO.initSpill(spillere);
				response.sendRedirect("spillServlet?spillID="+newSpillID);
				break;
			default:
				response.sendRedirect("Meny");
				break;
			}
			
		}
	}

}
