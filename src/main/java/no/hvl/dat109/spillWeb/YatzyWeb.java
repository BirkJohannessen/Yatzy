package no.hvl.dat109.spillWeb;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import no.hvl.dat109.dao.SpillerDAO;
import no.hvl.dat109.spill.Spiller;
import no.hvl.dat109.spill.Terning;
import no.hvl.dat109.spill.spillUtils;

	/**
	 * 
	 * @author BirkJohannessen
	 * 
	 * Spill klasse med metoder for spillet skal funke opp mot web
	 *
	 */
public class YatzyWeb {
	
	/**
	 * @author BirkJohannessen
	 * @param spillTilstand fra DAO
	 * @return int runde
	 * 
	 * Metoden skal ta spilletsTilstand og finne ut hvilken runde vi har kommet til.
	 */
	public static int getRunde(SpillerDAO spillerDAO, String spillID) {
		ArrayList<Integer> spill = spillerDAO.hentSpillTilstand(spillID);
		List<String> spillerTab = spillerDAO.hentSpillere(spillID);
		return 0;
	}
	
	/**
	 * @author Birk Johannessen
	 * @param spillerDAO
	 * @param spillID
	 * @return String mobil
	 * 
	 * finner ut fra spillets tilstand hvilken spillers tur
	 */
	public static String aktuellSpillersTur(SpillerDAO spillerDAO, String spillID) {
		ArrayList<Integer> spill = spillerDAO.hentSpillTilstand(spillID);
		List<String> spillerTab = spillerDAO.hentSpillere(spillID);
		int antSpillere = spillerTab.size();
		// TODO logikk for å hente en spillers tur
		return null;
	}

	/**
	 * @author Birk Johannessen
	 * @param request
	 * @param kopp
	 * @return oppdatertKopp
	 * 
	 * Tar imot en Terning kopp, triller de terningene spilleren vil kaste på nytt og sender den oppdaterte
	 * koppen tilbake.
	 */
	public static ArrayList<Integer> oppdaterKopp(HttpServletRequest request, ArrayList<Integer> kopp) {
		int removed = 0;
		if (request.getParameter("index0")!=null) {
			kopp.remove(0 - removed);
			removed++;
		}
		if (request.getParameter("index1")!=null) {
			kopp.remove(1 - removed);
			removed++;
		}
		if (request.getParameter("index2")!=null) {
			kopp.remove(2 - removed);
			removed++;
		}
		if (request.getParameter("index3")!=null) {
			kopp.remove(3 - removed);
			removed++;
		}
		if (request.getParameter("index4")!=null) {
			kopp.remove(4 - removed);
			removed++;
		}
		ArrayList<Integer> nyKopp = new ArrayList<Integer>();

		nyKopp.addAll(kopp);
		nyKopp.addAll(Terning.trillResterendeTerning(5 - kopp.size()));
		return nyKopp;
	}


	/**
	 * @author Birk Johannessen
	 * @param runde
	 * @param kopp
	 * @return int sum
	 * 
	 * metoden summerer opp en terninkopp til score IHT spillreglene for hvilken runde
	 */
	public static int getSum(int runde, ArrayList<Integer> kopp) { //TODO fiks 6,7,15
		int sum=0;
		switch (runde) {
		case 0:
			sum= spillUtils.sumTabs(kopp, runde);
			break;
		case 1:
			sum=spillUtils.sumTabs(kopp, runde);
			break;
		case 2:
			sum=spillUtils.sumTabs(kopp, runde);
			break;
		case 3:
			sum=spillUtils.sumTabs(kopp, runde);
			break;
		case 4:
			sum=spillUtils.sumTabs(kopp, runde);
			break;
		case 5:
			sum=spillUtils.sumTabs(kopp, runde);
			break;
		case 6:
			//spillUtils.sum(spiller));
			break;
		case 7:
			//spiller.setScore(runde, 12);
			break;
		case 8:
			sum=spillUtils.TreLike(kopp);
			break;
		case 9:
			sum=spillUtils.FireLike(kopp);
			break;
		case 10:
			sum=spillUtils.Hus(kopp);
			break;
		case 11:
			sum=spillUtils.LitenStraight(kopp);
			break;
		case 12:
			sum=spillUtils.StorStraight(kopp);
			break;
		case 13:
			sum=spillUtils.Sjanse(kopp);
			break;
		case 14:
			sum=spillUtils.Yatzhee(kopp);
			break;
		case 15:
			//spillUtils.totalScore(spiller);
			break;
		default:
			break;
		}
		return sum;
	}
}
