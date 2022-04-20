package no.hvl.dat109.BackendUtils;

import javax.ejb.EJB;

import no.hvl.dat109.dao.SpillerDAO;

/**
 * 
 * @author Birk Johannessen
 * 
 * validator klasse
 *
 */

public class Validator {
	
	@EJB
	private SpillerDAO spillerDAO;
	
	/**
	 * @author Birk Johannessen
	 * @param mobil
	 * @param passord
	 * @param spillerDAO
	 * @return boolean
	 * 
	 * Skjekker i DB om login oppgitt er stemmer.
	 * 
	 */
	public static boolean isValidLogin(String mobil, String passord, SpillerDAO spillerDAO) {
		if(spillerDAO.finnes(mobil)) {
			return spillerDAO.getSpiller("95772111").getPassord().equals(passord);
		}else {
			return false;
		}
	}
	
}
