package no.hvl.dat109.brukergrensesnitt;

import no.hvl.dat109.spill.Spiller;
/**
 * 
 * @author Birk Johannessen
 * 
 * brukes kun i tekst/konsoll/beta spillet
 */
public class Tekstgrensesnitt {

	
	/**
	 *  @author Birk Johannessen
	 * @param spillere
	 * 
	 *  printer ut matrisen av spillet
	 */
	public static void printSpillTabell(Spiller[] spillere) {
		System.out.print("[   ]   ");
		for(int s=0;s<spillere.length;s++) {
			System.out.print("["+spillere[s].getNavn()+"]");
		}
		System.out.println("");
		
		for(int i=0;i<16;i++) {
			printRadInfo(i);
			for(int j=0;j<spillere.length;j++){
				Spiller aktivSpiller=spillere[j%spillere.length];
				System.out.print("["+aktivSpiller.getScore(i)+"]  ");
			}
			System.out.println("");
		}
	}
	
	
	private static void printRadInfo(int i) {
		i=i+1;
		String ut = "";
		switch(i) {
			case 1:
				ut="1ere       ";
				break;
			case 2:
				ut="2ere       ";
				break;
			case 3:
				ut="3ere       ";
				break;
			case 4:
				ut="4ere       ";
				break;
			case 5:
				ut="5ere       ";
				break;
			case 6:
				ut="6ere       ";
				break;
			case 7:
				ut="sum        ";
				break;
			case 8:
				ut="bonus      ";
				break;
			case 9:
				ut="3 like     ";
				break;
			case 10:
				ut="4 like     ";
				break;
			case 11:
				ut="hus        ";
				break;
			case 12:
				ut="liten str8 ";
				break;
			case 13:
				ut="straight   ";		
				break;
			case 14:
				ut="sjanse     ";
				break;
			case 15:
				ut="yatzee     ";
				break;
			case 16:
				ut="total score";
				break;
		}
		System.out.print("["+ut+"]  ");
	}
}
