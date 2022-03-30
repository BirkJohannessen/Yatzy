package no.hvl.dat109.spill;

import java.util.ArrayList;

  /**
 * 
 * @author anine & am
 *
 */

public class Spiller {
	
	/**
	 * Definerer variablene 
	 */
	private ArrayList<Integer> SpillerScore;
	
	private int rundenummer;
	private int score;
	private String navn;
	
	
	/**
	 * Konstruktør 
	 * @param rundenummer
	 * @param score
	 */
	public Spiller (int rundenummer, int score) {
		this.navn=navn;
		this.SpillerScore = new ArrayList<Integer>(15);
	}
	/**
	 * Setter scoren
	 * @param rundenummer
	 * @param score
	 */
	public void SetScore(int rundenummer, int score) {
		
		SpillerScore.set(rundenummer, score);
		
	}
	/**
	 * Henter scoren
	 * @return
	 */
	public ArrayList<Integer> GetScore() {
		return SpillerScore; 
		
	}
	
	}
		


}
