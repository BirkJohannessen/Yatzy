package no.hvl.dat109.spill;


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
	 * @return resultat på antall terninger etter fem trilte terninger
	 */
	
	
	public static int[] trillTerninger() {
        int[] kast = new int[5];
        for (int i = 0; i < 5; i++) {
            kast[i] = (int) ((Math.random() * 6) + 1);
        }
        return kast;
    }
	
	/**
	 * Metode for resterende terninger som skal trilles
	 * @param resterende
	 * @return resultat på antall terninger som ikke ble ønskelig 
	 */
		
	public static int[] trillResterendeTerning(int resterende) {
        int[] kast = new int[resterende];
        for (int i = 0; i < resterende; i++) {
            kast[i] = (int) ((Math.random() * 6) + 1);
        }
        return kast;
    }
	}
	











