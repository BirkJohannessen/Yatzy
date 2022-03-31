package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.brukergrensesnitt.Tekstgrensesnitt;

public class Yatzy {
	
	private int antSpillere;
	private Spiller[] spillere;
	
	
	public Yatzy(Spiller[] spillere) {
		this.antSpillere=spillere.length;
		this.spillere=spillere;
	}
	
	/**
	 * @author Birk Johannessen
	 * Roterer mellom alle spillernes tur 15 ganger, til spillet er ferdig.
	 * 
	 * 
	 */
	public void spill() {
		for(int runde=0;runde<15;runde++) {
			for(int trekk=0;trekk<antSpillere;trekk++) {
			Spiller aktivSpiller=spillere[trekk%antSpillere];
			System.out.println(aktivSpiller.getNavn()+"'s tur!");
			nesteSpiller(aktivSpiller,runde);
			}
		Tekstgrensesnitt.printSpillTabell(spillere); //print info

		}
		System.out.println("spillet er slutt!");
	}
	/**
	 * @author Birk Johannessen
	 * gjør alt av spilllogikk
	 * @param spiller
	 * @param hvilken runde det er. altså 1ere,2ere,3ere, par etc etc.1-15
	 */
	public void nesteSpiller(Spiller spiller, int runde) {
		ArrayList<Integer> kopp = Terning.trillTerninger();
		ArrayList<Integer> lagretTerningKast = Utils.omKast(kopp);
		
		int nyttKast = 5-lagretTerningKast.size();
		kopp = Terning.trillResterendeTerning(nyttKast);

		lagretTerningKast.addAll(Utils.omKast(kopp));

		nyttKast=5-lagretTerningKast.size();
		kopp = Terning.trillResterendeTerning(nyttKast);
		lagretTerningKast.addAll(kopp);
		
		System.out.println("ditt endelige kast: "+lagretTerningKast.toString()); 

		switch(runde) {
			case 0:
				spiller.setScore(runde, sumTabs(lagretTerningKast, runde));
				break;
			case 1:
				spiller.setScore(runde, sumTabs(lagretTerningKast, runde));
				break;
			case 2:
				spiller.setScore(runde, sumTabs(lagretTerningKast, runde));
				break;
			case 3:
				spiller.setScore(runde, sumTabs(lagretTerningKast, runde));
				break;
			case 4:
				spiller.setScore(runde, sumTabs(lagretTerningKast, runde));
				break;
			case 5:
				spiller.setScore(runde, sumTabs(lagretTerningKast, runde));
				break;
			default:
				spiller.setScore(runde, 1);
				break;
		}
		
		
	}

	private int sumTabs(ArrayList<Integer> lagretTerningKast, int runde) {
		if(lagretTerningKast.isEmpty()) {
			return 0;
		}	
		int sum = 0;
		for(int i=0;i<5;i++) {
			if(lagretTerningKast.get(i)==runde+1) {
				sum+=lagretTerningKast.get(i);
			}
		}
		return sum;
	}


	public void storeData() {
		//TODO
		//might be removed.
		
	}
	
}
