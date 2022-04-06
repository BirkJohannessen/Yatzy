package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.Arrays;



public class spillUtils {
	
	
	/**
	 * Sjekker om listen inneholder 3 like.
	 * Dersom det stemmer returnerer metoden summen av disse, ellers returnerer 0.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	public static int TreLike(ArrayList<Integer> Liste) {
		
		
		// hvis listen inneholder 3 like så gi scoren.
		Integer oversikt[] = new Integer[] {0, 0, 0, 0, 0, 0};
	
		
		for(int i : Liste) {
			oversikt[i-1] = oversikt[i-1]+1;
		}
		
		for(int i = 0; i<6; i++) {
			if(oversikt[i] >=3)
				return (i+1)*3;
		
		}
		return 0;
		
	}
	/**
	 * Sjekker om listen inneholder fire like.
	 * Dersom det stemmer returnerer metoden summen av disse, ellers returnerer 0.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	public static int FireLike(ArrayList<Integer> Liste) {
		
		// hvis listen inneholder 3 like så gi scoren.
		Integer oversikt[] = new Integer[] {0, 0, 0, 0, 0, 0};
	
		
		for(int i : Liste) {
			oversikt[i-1] = oversikt[i-1]+1;
		}
		
		for(int i = 0; i<6; i++) {
			if(oversikt[i] >=4)
				return (i+1)*4;
		
		}
		return 0;
		
	}
	/**
	 * Sjekker om ArrayListen<Integer> inneholder 1, 2, 3, 4, 5. 
	 * Returnerer 15 dersom det stemmer, ellers 0.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	public static int LitenStraight(ArrayList<Integer> Liste) {
		
		if(Liste.contains(1) && Liste.contains(2) && Liste.contains(3) && Liste.contains(4) && Liste.contains(5))
				return 15;
		
				return 0;
		
	}
	/**
	 * Sjekker om ArrayListen<Integer> inneholder 2, 3, 4, 5, 6. 
	 * Returnerer 20 dersom det stemmer, ellers 0.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	public static int StorStraight(ArrayList<Integer> Liste) {
		
		if(Liste.contains(2) && Liste.contains(3) && Liste.contains(4) && Liste.contains(5) && Liste.contains(6))
				return 20;
		
				return 0;
		
	}
	
	/**
	 * Tar inn ArrayList<Integer> og returnerer summen av alle tallene.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	public static int Sjanse(ArrayList<Integer> Liste) {
		
		int sum = 0;
		
		for(int i : Liste) {
			sum += i;
		}
			
		
		return sum;
	}
	
	/**
	 * Metoden tar inn ArrayList<Integer> og sjekker om den inneholder 3 like og 2 like (hus), returnerer summen kravene er oppnådd.
	 * Ellers returnerer metoden 0.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	public static int Hus(ArrayList<Integer> Liste) {
		
		Integer oversikt[] = new Integer[] {0, 0, 0, 0, 0, 0};
	
		boolean treLike = false;
		boolean toLike = false;
		int sum = 0;
		
		// counter
		for(int i : Liste) {
			oversikt[i-1] = oversikt[i-1]+1;
		}
		
		// sjekker om tre like
		for(int i = 0; i<6; i++) {
			if(oversikt[i] == 3)
				treLike = true;
		}
		
		// sjekker om to like
		for(int i = 0; i<6; i++) {
			if(oversikt[i] == 2)
				toLike = true;
		}
		
		if(treLike && toLike) {
		
		
		for(int i : Liste) {
			sum += i;
		}
			}
		return sum;
		
	}
	/**
	 * Metoden tar inn ArrayList<Integer> og sjekker om alle tallene i arrayen er like. 
	 * Returnerer 50 dersom alle er like ellers 0.
	 * @param ArrayList<Integer>
	 * @return int
	 */
	
	public static int Yatzhee(ArrayList<Integer> Liste) {
		
		
		for(int i : Liste) {
			
			if(i != (Liste.get(0)))
					return 0;
		}

		return 50;
	}
	
	/**
	 * Metoden tar inn en spiller og finner summen til de 6 første trinnene i yatzhee.
	 * @param Spiller spiller
	 * @return int
	 */
	public static int sum(Spiller spiller) {
		
		ArrayList<Integer> tabell = spiller.getSpillerScore();
		int sum = 0;
		
		for(int i = 0; i<6; i++) {
			sum += tabell.get(i);
		}
		return sum;
		
	}
	
	/**
	 * Metoden tar inn en spiller og finner totalsummen yatzhee.
	 * @param Spiller spiller
	 * @return int
	 */
	public static int totalScore(Spiller spiller) {
		
		ArrayList<Integer> tabell = spiller.getSpillerScore();
		int sum = 0;
		
		for(int i = 0; i<15; i++) {
			sum += tabell.get(i);
		}
		return sum;
		
	}
	
	/**
	 * Metoden finner spilleren med høyest score og returnerer den.
	 * @param Spiller[] spillere
	 * @return Spiller
	 */
	public static Spiller finneVinner(Spiller[] spillere) {
		
		Spiller vinner = null;
		int score = 0;
		for(Spiller i : spillere) {
			ArrayList<Integer> tabell = i.getSpillerScore();
			if(tabell.get(15) <= score) {
				vinner = i;
				score = tabell.get(15);
			}
			
		}
		return vinner;
	}
	

}
