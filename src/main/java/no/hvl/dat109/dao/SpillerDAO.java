package no.hvl.dat109.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import no.hvl.dat109.spill.Utils;

/**
 * 
 * @author anine & am
 *
 *         sporringer opp mot database
 */
@Stateless
public class SpillerDAO {
	@PersistenceContext(name = "spillerPU")
	private EntityManager em;

	/**
	 * 
	 * 
	 * @return liste av spillere
	 * 
	 *         henter mobil til alle spillere og legger i List
	 */
	public synchronized List<SpillerDB> hentAlleSpillere() {
		return em.createQuery("SECELCT a FROM Spiller a order by a.fornavn", SpillerDB.class).getResultList();

	}

	/**
	 * 
	 * @param spillID
	 * @return liste av spillere
	 * 
	 *         henter mobil til alle spillere gitt et spillID og legger i List
	 */
	public synchronized List<String> hentSpillere(String spillID) {
		List<String> spillere = new ArrayList<String>();
		SpillDB spill = em.find(SpillDB.class, spillID);
		String spillereStr = spill.getSpillere();
		int antSpillere = spillereStr.length() / 8;
		for (int i = 0; i < antSpillere; i++) {
			spillere.add(spillereStr.substring(i * 8, ((i + 1) * 8) - 1));
		}
		return spillere;
	}

	/**
	 * 
	 * @param spillID
	 * @return liste av spillTilstand
	 * 
	 *         henter spiller tabeller i DB og lager en tabell som ser slik ut:
	 * 
	 *         [0]spiller1 Runde1 [1]spiller2 Runde1 [2]spiller1 Runde2 .....
	 *         [29]spiller2 Runde15
	 * 
	 * 
	 */
	public synchronized ArrayList<Integer> hentSpillTilstand(String spillID) {
		List<String> spillere = hentSpillere(spillID);
		int antSpillere = spillere.size();
		ArrayList<Integer> spillTilstand = new ArrayList<Integer>();
		List<SpillverdierDB> spillverdier = new ArrayList<SpillverdierDB>();
		for (String a : spillere) {
			spillverdier.add(hentSpillerSpill(spillID, a));
		}
		for (int i = 0; i < (antSpillere * 15) - 1; i++) {
			spillverdier.get(i % antSpillere);
			int runde = i / antSpillere;
			spillTilstand = setIndexI(spillTilstand, spillverdier.get(i % antSpillere), runde);
		}

		return null;
	}

	private ArrayList<Integer> setIndexI(ArrayList<Integer> spillTilstand, SpillverdierDB spiller, int runde) {
		switch (runde) {
		case 0:
			spillTilstand.add(spiller.getIndex0());
			break;

		case 1:
			spillTilstand.add(spiller.getIndex1());

			break;

		case 2:
			spillTilstand.add(spiller.getIndex2());
			break;

		case 3:
			spillTilstand.add(spiller.getIndex3());
			break;

		case 4:
			spillTilstand.add(spiller.getIndex4());
			break;

		case 5:
			spillTilstand.add(spiller.getIndex5());
			break;

		case 6:
			spillTilstand.add(spiller.getIndex6());
			break;

		case 7:
			spillTilstand.add(spiller.getIndex7());
			break;

		case 8:
			spillTilstand.add(spiller.getIndex8());
			break;

		case 9:
			spillTilstand.add(spiller.getIndex9());
			break;

		case 10:
			spillTilstand.add(spiller.getIndex10());
			break;

		case 11:
			spillTilstand.add(spiller.getIndex11());
			break;

		case 12:
			spillTilstand.add(spiller.getIndex12());
			break;

		case 13:
			spillTilstand.add(spiller.getIndex13());
			break;

		case 14:
			spillTilstand.add(spiller.getIndex14());
			break;
		}
		return spillTilstand;
	}

	public synchronized SpillverdierDB hentSpillerSpill(String spillID, String mobil) {
		SpillverdierDB spillverdier = em
				.createQuery("SELECT t FROM TABLE t where t.value = :value1", SpillverdierDB.class)
				.setParameter("value1", "some value").getSingleResult();
		return spillverdier;

	}

	/**
	 * 
	 * @param spillID
	 * @param runde
	 * @param sum
	 * @param mobil
	 * 
	 *                tar et spillID og lagrer en sum for en runde i databasen.
	 */
	public synchronized void setScore(String spillID, int runde, int sum, String mobil) {
		SpillverdierDB spillverdier = hentSpillerSpill(spillID, mobil);
		switch (runde) {
		case 0:
			spillverdier.setIndex0(sum);
			break;

		case 1:
			spillverdier.setIndex1(sum);
			break;

		case 2:
			spillverdier.setIndex2(sum);
			break;

		case 3:
			spillverdier.setIndex3(sum);
			break;

		case 4:
			spillverdier.setIndex4(sum);
			break;

		case 5:
			spillverdier.setIndex5(sum);
			break;

		case 6:
			spillverdier.setIndex6(sum);
			break;

		case 7:
			spillverdier.setIndex7(sum);
			break;

		case 8:
			spillverdier.setIndex8(sum);
			break;

		case 9:
			spillverdier.setIndex9(sum);
			break;

		case 10:
			spillverdier.setIndex10(sum);
			break;

		case 11:
			spillverdier.setIndex11(sum);
			break;

		case 12:
			spillverdier.setIndex12(sum);
			break;

		case 13:
			spillverdier.setIndex13(sum);
			break;

		case 14:
			spillverdier.setIndex14(sum);
			break;
		}
		em.persist(spillverdier);
	}

	/**
	 * 
	 * @param mobil
	 * @return
	 * 
	 *         ser om en spiller finnes i databasen
	 */
	public synchronized boolean finnes(String mobil) {
		for (SpillerDB a : hentAlleSpillere()) {
			if (a.getMobil().equals(mobil)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param spillere
	 * @return String spillID
	 * 
	 *         lager et nytt spill i databasen med 1-6 spillere
	 */
	public synchronized String initSpill(String[] spillere) {
		String spillereStr = "";
		for (String a : spillere) {
			spillereStr += a;
		}
		String spillID = Utils.genererSpillId() + "";
		SpillDB spill = new SpillDB(spillID, spillereStr);
		em.persist(spill);
		for (String a : spillere) {
			em.persist(new SpillverdierDB(spillID, a, null, null, null, null, null, null, null, null, null, null, null,
					null, null, null, null));
		}

		return spillID;

	}

	public synchronized SpillerDB getSpiller(String mobil) {
		return em.find(SpillerDB.class, mobil);
	}
}