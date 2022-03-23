package no.hvl.dat109.spill;


import java.util.Random;

public class Terning {
	
	
	private static int[] Tern;
	
	public static int[] trillTerninger() {
		Random ran = new Random();
		for(int i = 0; i<5; i++) {
			
			Tern[i] = ran.nextInt(6);

		
		}
		return Tern;
	}
}



