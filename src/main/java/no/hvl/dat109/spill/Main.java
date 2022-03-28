package no.hvl.dat109.spill;

public class Main {

	public static void main(String[] args) {
		Spiller[] spillere = Utils.hentSpillere();
		Yatzy yatzy = new Yatzy(spillere);
		
		yatzy.spill();
	}

}
