package no.hvl.dat109.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import no.hvl.dat109.BackendUtils.LoginUtil;
import no.hvl.dat109.BackendUtils.Validator;
import no.hvl.dat109.dao.SpillerDAO;


/**
 * Servlet implementation class LoginnServlet
 */
@WebServlet("/LoginnServlet")
public class LoginnServlet extends HttpServlet {
	@EJB
	private SpillerDAO spillerDAO;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/Logginn.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String passord=request.getParameter("passord");
		String mobil=request.getParameter("bruker");
		
		if(Validator.isValidLogin(mobil,passord, spillerDAO)) {
			LoginUtil.logIn(request, mobil);
			response.sendRedirect("Meny");
		}else {
			response.sendRedirect("LoginnServlet"+"?f2=Ugyldig brukernavn og/eller passord");
		}
		
	}

}