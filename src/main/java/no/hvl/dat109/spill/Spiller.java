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
	public Spiller (String navn) {
		this.navn=navn;
		this.SpillerScore = new ArrayList<Integer>(15);
	}
	/**
	 * Setter scoren
	 * @param rundenummer
	 * @param score
	 */
	public void setScore(int rundenummer, int score) {
		
		SpillerScore.set(rundenummer, score);
		
	}
	/**
	 * Henter scoren
	 * @return
	 */
	public ArrayList<Integer> getScore() {
		return SpillerScore; 
		
	}
	
	@Override
	public String toString() {
		return spillerScore.toString();
	}
		


}
