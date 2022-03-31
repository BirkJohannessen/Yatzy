package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {
	public static void main(String[] args) {

		//Spiller[] spillere = Utils.hentSpillere();
		Spiller spiller1 = new Spiller("birk");
		Spiller spiller2 = new Spiller("anders-marius");
		Spiller[] spillere = {spiller1,spiller2};
		Yatzy yatzy = new Yatzy(spillere);
		yatzy.spill();
   }
}

