package no.hvl.dat109.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import no.hvl.dat109.dao.SpillerDAO;

@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
   
	@EJB
	private SpillerDAO spillerDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("test__123");
		System.out.println(spillerDAO.getSpiller("95772111").getPassord());
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(600);
		session.setAttribute("mobil", "123123");
		request.setAttribute("test1", spillerDAO.getSpiller("95772111").getPassord());
		//request.getSession().setAttribute("testTab", spillerDAO.hentSpillere("1234567"));
		request.getRequestDispatcher("WEB-INF/jsp/TestDB.jsp").forward(request, response);
	}


}
