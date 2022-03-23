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
	
	
	@PersistenceContext(name ="spillertDB")
	private EntityManager em;
	

	public List<Spiller>hentAlleSpillere(Spiller s) {
		
	em.presist(s);
		
		
	}
	
	public List<Yatzy>hentSpiller(Yatzy y){
		em.presist(y);
		
	
		
	}
}


