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
	 */
	
	private static int[] Terning;
	
	public static int[] trillTerninger() {
		Random ran = new Random();
		for(int i = 0; i<5; i++) {
			
			Terning[i] = ran.nextInt(6);

		
		}
		return Terning;
	}
}



