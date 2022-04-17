package no.hvl.dat109.BackendUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 * 
 * @author BirkJ
 *
 * loginklasse til LoginnServlet
 */

public class LoginUtil {
	/**
	 * @author Birk Johannessen
	 * @param request
	 * @param mobil
	 * 
	 * starter session og setter opp cookie
	 */

	public static void logIn(HttpServletRequest request, String mobil) {
		logOut(request);
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(600);
		session.setAttribute("mobil", mobil);
	}

	/**
	 * @author Birk Johannessen
	 * @param request
	 * @return boolean
	 * 
	 * skjekker at en bruker er logget på.
	 */
	public static boolean erInnlogget(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return session != null && session.getAttribute("mobil") != null;
	}
	/**
	 * @author Birk Johannessen
	 * @param request
	 * hvis en bruker logger av blir det gjort skikkelig
	 */
	public static void logOut(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
	}
}