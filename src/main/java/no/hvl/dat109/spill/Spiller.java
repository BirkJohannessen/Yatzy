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
	private ArrayList<Integer> spillerScore;
	private String navn;
	
	/**
	 * Konstruktør 
	 * 
	 * 
	 */
	public Spiller(String navn) {
		this.setNavn(navn);
		this.spillerScore = new ArrayList<Integer>(15);
	}
	/**
	 * Setter scoren
	 * @param rundenummer
	 * @param score
	 */
	public void setScore(int rundenummer, int score) {
		spillerScore.add(rundenummer, score);
	}
	/**
	 * henter en score gitt hvilken runde
	 * 
	 */
	public String getScore(int index) {
		if(index >= spillerScore.size() || index < 0){
			  return "";
			}else{
			 return spillerScore.get(index)+"";
			}
	}
	
	/**
	 * Henter score tabellen
	 * @return
	 */
	public ArrayList<Integer> getSpillerScore() {
		return spillerScore; 
		
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	@Override
	public String toString() {
		return spillerScore.toString();
	}
		


}
