package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginnServlet
 */
@WebServlet("/LoginnServlet")
public class LoginnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public boolean Validering(String s) {
		return s!=null;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String brukernavn = request.getParameter("brukernavn");
		
		if(Validering(brukernavn)) {
			response.sendRedirect("/MenyServlet");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
