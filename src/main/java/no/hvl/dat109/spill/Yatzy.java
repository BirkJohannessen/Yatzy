package no.hvl.dat109.spill;

import java.util.List;

public class Yatzy {
	
	private int antSpillere;
	private Spiller[] spillere;
	
	
	public Yatzy(int antSpillere, Spiller[] spillere) {
		this.antSpillere=antSpillere;
		this.spillere=spillere;
	}
	
	/**
	 * @author Birk Johannessen
	 * Roterer mellom alle spillernes tur 15 ganger, til spillet er ferdig.
	 * 
	 * 
	 */
	public void Spill() {
		for(int runde=1;runde<15;runde++) {
			for(int trekk=0;trekk<antSpillere;trekk++) {
			Spiller aktivSpiller=spillere[trekk%antSpillere];
			nesteSpiller(aktivSpiller,runde);
			}
		}
	}
	/**
	 * @author Birk Johannessen
	 * gjør alt av spilllogikk
	 * @param spiller
	 * @param hvilken runde det er. altså 1ere,2ere,3ere, par etc etc.1-15
	 */
	public void nesteSpiller(Spiller spiller, int runde) {
		int[] kopp = Terning.trillTerninger();
		Utils.
	}
	public void storeData() {
		//TODO
		//might be removed.
		
	}
	
}
