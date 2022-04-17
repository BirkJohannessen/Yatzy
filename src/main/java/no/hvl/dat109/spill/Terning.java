package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.Random;


/**
 * Definerer en terninger til Yatzy .
 * 
 * @author a9 og am
 * @shoutout hesthamarG
 * 
 * brukes b�de i WEB og tekst spillet.
 */
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

			terningVerdi = new ArrayList<Integer>();
		}

		else {

			for (int i = 0; i < resterende; i++) {

				terningVerdi.add((int) ((Math.random() * 6) + 1));
			}

		}
		return terningVerdi;
	}
}
