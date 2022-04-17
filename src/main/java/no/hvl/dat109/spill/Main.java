package no.hvl.dat109.spill;


/**
 * @author Birk Johannessen
 * 
 * starter et yatzy spill ment til tekst i konsoll
 * 
 */
public class Main {


	public static void main(String[] args) {
		Spiller[] spillere = Utils.hentSpillere();
		Yatzy yatzy = new Yatzy(spillere);
		yatzy.spill();
	}

}
