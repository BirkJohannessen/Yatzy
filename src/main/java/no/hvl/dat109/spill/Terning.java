package no.hvl.dat109.spill;

import java.util.ArrayList;
/**
 * Definerer en terninger til Yatzy .
 * 
 * @author aninehammersborg
 *
 */
import java.util.Random;

public class Terning {

	/**
	 * Tilfeldig trill for treninger
	 * 
	 * @return resultat på antall terninger etter fem trilte terninger
	 */

	public static ArrayList<Integer> trillTerninger() {

		ArrayList<Integer> trill = new ArrayList<Integer>(5);

		for (int i = 0; i < 5; i++) {
			trill.add((int) ((Math.random() * 6) + 1));

		}
		return trill;
	}

	/**
	 * Metode for resterende terninger som skal trilles
	 * 
	 * @param resterende
	 * @return resultat på antall terninger som ikke ble ønskelig
	 */

	public static ArrayList<Integer> trillResterendeTerning(int resterende) {

		ArrayList<Integer> terningVerdi = new ArrayList<Integer>(resterende);

		if (resterende == 0) {

			terningVerdi = null;
		}

		else {

			for (int i = 0; i < resterende; i++) {

				terningVerdi.add((int) ((Math.random() * 6) + 1));
			}

		}
		return terningVerdi;
	}
}
