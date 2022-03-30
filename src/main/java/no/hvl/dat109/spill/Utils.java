package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* @Author Anders Lerang
 * Utils klasse
 */
public class Utils {

	/*
	 * Antall spillere
	 */
	public static void antallSpillere() {

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
	}

	public static void omKast(ArrayList<Integer> kopp) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" " + kopp + " ");

		System.out.println("\n");
		System.out.println("Hvilken terninger vil du kaste? (i index)");
		
		while(sc.hasNext() == true) {
		
		int behold = sc.nextInt();
		
		kopp.remove(behold);
		
		kopp.forEach(x -> System.out.println(x));
		
		}
	}

	/*
	 * Metode for å generere en unik spill id
	 */
	public static int genererSpillId() {

		Random rand = new Random();
		int maxNumber = 10;

		int randomNumber = rand.nextInt(maxNumber) + 1;

		return randomNumber;

	}


}
