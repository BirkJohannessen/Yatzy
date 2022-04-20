package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.brukergrensesnitt.Tekstgrensesnitt;

/**
 * 
 * @author Birk Johannessen
 * 
 * løsningen på yatzys spill logikk ment for konsoll/tekst beta løsning
 *
 */
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
		for(int runde=0;runde<16;runde++) {
			for(int trekk=0;trekk<antSpillere;trekk++) {
			Spiller aktivSpiller=spillere[trekk%antSpillere];
			System.out.println(aktivSpiller.getNavn()+"'s tur!");
			nesteSpiller(aktivSpiller,runde);
			}
		Tekstgrensesnitt.printSpillTabell(spillere); //print info
		}
		System.out.println("spillet er slutt! ");//+spillUtils.finneVinner(spillere).getNavn()+" vant!");
	}
	/**
	 * @author Birk Johannessen
	 * gjÃƒÂ¸r alt av spilllogikk
	 * @param spiller
	 * @param hvilken runde det er. altsÃƒÂ¥ 1ere,2ere,3ere, par etc etc.1-15
	 */
	public void nesteSpiller(Spiller spiller, int runde) {
		ArrayList<Integer> kopp;
		ArrayList<Integer> lagretTerningKast=null;
		
		if(runde!=6&&runde!=15) {
			kopp = Terning.trillTerninger();
			lagretTerningKast = Utils.omKast(kopp);
			int nyttKast = 5-lagretTerningKast.size();
			kopp = Terning.trillResterendeTerning(nyttKast);
	
			lagretTerningKast.addAll(Utils.omKast(kopp));
			
			nyttKast=5-lagretTerningKast.size();
			kopp = Terning.trillResterendeTerning(nyttKast);
			lagretTerningKast.addAll(kopp);
			
			System.out.println("ditt endelige kast: "+lagretTerningKast.toString());
		}
		

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
			case 6:
				spiller.setScore(runde, spillUtils.sum(spiller));
				break;
			case 7:
				spiller.setScore(runde, 12);
				break;
			case 8:
				spiller.setScore(runde, spillUtils.TreLike(lagretTerningKast));
				break;
			case 9:
				spiller.setScore(runde, spillUtils.FireLike(lagretTerningKast));
				break;
			case 10:
				spiller.setScore(runde, spillUtils.Hus(lagretTerningKast));
				break;
			case 11:
				spiller.setScore(runde, spillUtils.LitenStraight(lagretTerningKast));
				break;
			case 12:
				spiller.setScore(runde, spillUtils.StorStraight(lagretTerningKast));
				break;
			case 13:
				spiller.setScore(runde, spillUtils.Sjanse(lagretTerningKast));
				break;
			case 14:
				spiller.setScore(runde, spillUtils.Yatzhee(lagretTerningKast));
				break;
			case 15:
				spiller.setScore(runde, spillUtils.totalScore(spiller));
				break;
			default:
				System.out.println("noe gikk galt");
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


	
}
