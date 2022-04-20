package no.hvl.dat109.dao;

 import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 * 
 * @author anine & am
 *
 * sporringer opp mot database
 */
@Stateless
public class SpillerDAO {
	@PersistenceContext(name ="spillerPU")
	private EntityManager em;
	

	/**
	 * 
	 * 
	 * @return liste av spillere
	 * 
	 *  henter mobil til alle spillere og legger i List
	 */
	public synchronized List<String>hentAlleSpillere() {
		return null;

		
	}
	/**
	 * 
	 * @param spillID
	 * @return liste av spillere
	 * 
	 * henter mobil til alle spillere gitt et spillID og legger i List
	 */
	public synchronized List<String> hentSpillere(String spillID){
		return null;//em.createQuery("SELECT MOBIL FROM SPILL WHERE SPILLID="+spillID, String.class).getResultList();
		//TODO - henter mobil til alle spillere gitt et spillID og legger i List
	}
	
	/**
	 * 
	 * @param spillID
	 * @return liste av spillTilstand
	 * 
	 * henter spiller tabeller i DB og lager en tabell som ser slik ut:
	 * 
	 * [0]spiller1 Runde1
	 * [1]spiller2 Runde1
	 * [2]spiller1 Runde2
	 *  .....
	 * [29]spiller2 Runde15
	 * 
	 * 
	 */
	public synchronized ArrayList<Integer> hentSpillTilstand(String spillID){
		//TODO
		//skal levere IHT DB modellen
		return null;
	}
	/**
	 * 
	 * @param spillID
	 * @param runde
	 * @param sum
	 * @param mobil
	 * 
	 * tar et spillID og lagrer en sum for en runde i databasen.
	 */
	public synchronized void setScore(String spillID, int runde, int sum, String mobil) {
		//TODO
		//lagrer en verdi i DB
	}

	/**
	 * 
	 * @param mobil
	 * @return
	 * 
	 * ser om en spiller finnes i databasen
	 */
	public synchronized boolean finnes(String mobil) {
		//TODO - ser om en spiller finns gitt et mobilnummer.
		return false;
	}

	/**
	 * 
	 * @param spillere
	 * @return String spillID
	 * 
	 * lager et nytt spill i databasen med 1-6 spillere
	 */
	public synchronized String initSpill(String[] spillere) {
		//TODO lager plass i DB til et nytt spill
		
		//returnerer et generert spillID
		return null;
	}
	public synchronized SpillerDB getSpiller(String mobil) {
		return em.find(SpillerDB.class, mobil);
	}
}