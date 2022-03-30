package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author Anders Lerang Utils klasse
 */
public class Utils {

	/**
	 * @author ander Antall spillere
	 * return returnerer antall spillere
	 */
	public static int antallSpillere() {

		System.out.println("Hvor mange spillere?(2-6)");

		Scanner sc = new Scanner(System.in);

		int ant = sc.nextInt();

		if (ant >= 5) {

			System.out.println("For mange spillere, prøv igjen");

			ant = sc.nextInt();

		} else {
			System.out.println("Antall spillere: " + ant);
		}

		sc.close();
		return ant;
	}

	/**
	 * 
	 * @param kopp er terniger kastet fra spiller
	 * @return ønsket terninger etter kast
	 */
	public static ArrayList<Integer> omKast(ArrayList<Integer> kopp) {

		kopp.forEach(x -> System.out.print("[" + x + "]"));

		System.out.println("\n");

		System.out.println("Hvor mange terninger hvil du kaste?");
		System.out.println("Hvilken terninger vil du kaste? (i index)");

		Scanner ant = new Scanner(System.in);
		int antall = ant.nextInt();
		
		Scanner console = new Scanner(System.in);

		System.out.println("Du kaster " + antall + " terninger vekk");
		

		for (int i = 0; i < antall; i++) {

			kopp.remove(console.nextInt());

			kopp.forEach(x -> System.out.print("[" + x + "]"));

		}

		ArrayList<Integer> nyKopp = kopp;

		return nyKopp;
	}

	/**
	 * Metode for å generere en unik spill id
	 * return unik spillerid
	 */
	public static int genererSpillId() {

		Random rand = new Random();
		int maxNumber = 10;

		int randomNumber = rand.nextInt(maxNumber) + 1;

		return randomNumber;

	}

}
