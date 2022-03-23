package no.hvl.dat109.dao;

 import java.util.List;
 import javax.ejb.Stateless;
 import javax.persistence.EntityManager;
 import javax.persistence.PersistenceContext;

import no.hvl.dat109.spill.Spiller;
import no.hvl.dat109.spill.Yatzy;
/**
 * 
 * @author aninehammersborg
 *
 */

@Stateless

public class SpillerDAO {
	
	
	@PersistenceContext(name ="spillertDB")
	private EntityManager em;
	

	public List<Spiller>hentAlleSpillere() {
		
		return em.createQuery("select n from Spiller s", Spiller.class);
		
		
	}
	
	public List<Yatzy>hentSpiller(){
		return em.createQuery("select * from tilstand id", Yatzy.class);
	}
}
