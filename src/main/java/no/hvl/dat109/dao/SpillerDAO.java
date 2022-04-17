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
 */
@Stateless
public class SpillerDAO {
	
	/**
	 * Laget en EntityManager for spillertabellen i databasen
	 */
	@PersistenceContext(name ="spillerDB")
	private EntityManager em;
	

	/**
	 * 
	 * @param s
	 * @return en spørring som henter alle spillere fra databasen
	 */
	public List<String>hentAlleSpillere() {
		//TODO - henter mobil til alle spillere og legger i List
		return null;
		
	}

	public List<String> hentSpillere(String spillID){
		//TODO - henter mobil til alle spillere og legger i List

		return null;
	}
	public ArrayList<Integer> hentSpillTilstand(String spillID){
		//TODO
		//skal levere IHT DB modellen
		return null;
	}
	public void setScore(String spillID, int runde, int sum, String mobil) {
		//TODO
		//lagrer en verdi i DB
	}

	public String getPassord(String mobil) {
		//TODO - henter passordet til en bruker
		return null;
	}

	public boolean finnes(String mobil) {
		//TODO - ser om en spiller finns gitt et mobilnummer.
		return false;
	}
}


