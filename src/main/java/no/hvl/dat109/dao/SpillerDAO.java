package no.hvl.dat109.dao;

 import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
 import javax.persistence.PersistenceContext;

import no.hvl.dat109.spill.Spiller;
import no.hvl.dat109.spill.Yatzy;
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
	@PersistenceContext(name ="spillertDB")
	private EntityManager em;
	

	/**
	 * 
	 * @param s
	 * @return en spørring som henter alle spillere fra databasen
	 */
	public List<Spiller>hentAlleSpillere(Spiller s) {
		
		return em.createQuery("Select s form Spiller s", Spiller.class).getResultList();
		
		
	}
	/**
	 * 
	 * @param y
	 * @return en spørring som henter et Yatzy spill fra databasen
	 */
	
	public List<Yatzy>hentSpill(Yatzy y){
		
		return em.createQuery("Select y form Spiller y", Yatzy.class).getResultList();
		
	
		
	}
}


