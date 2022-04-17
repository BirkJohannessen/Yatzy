package no.hvl.dat109.spill;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author Anders Lerang Utils klasse
 * 
 * Utils klasse ment for tekst/konsoll beta l¯sning
 * brukes IKKE i web
 */
public class Utils {

	/**
	 * @author ander 
	 * Antall spillere return returnerer antall spillere
	 */
	public static int antallSpillere() {

		System.out.println("Hvor mange spillere?(2-6)");

		Scanner sc = new Scanner(System.in);

		int ant = sc.nextInt();

		if (ant >= 5) {

			System.out.println("For mange spillere, pr√∏v igjen");

			ant = sc.nextInt();

		} else {
			System.out.println("Antall spillere: " + ant);
		}

		return ant;
	}

	/**
	 * 
	 * @param kopp er terniger kastet fra spiller
	 * @return √∏nsket terninger etter kast
	 */
	public static ArrayList<Integer> omKast(ArrayList<Integer> kopp) {

		System.out.println("Du kastet: "+kopp.toString());

		System.out.println("Hvor mange terninger vil du kaste pÂ nytt?");


		Scanner sc = new Scanner(System.in);
		int antall = Integer.parseInt(sc.nextLine());
		System.out.println("Du kaster " + antall + " terninger vekk!");

		if(antall>=kopp.size()) {
			return new ArrayList<>();
		}else if(antall>0&&antall<kopp.size()) {
			System.out.println("Hvilken terninger vil du kaste? (i index)");
			for (int i = 0; i < antall; i++) {
				System.out.println(kopp.toString());
				kopp.remove(sc.nextInt());
			}
			System.out.println("lagret terningene: "+kopp);

		}
		return kopp;
		
		
	}

	/**
	 * Metode for √• generere en unik spill id return unik spillerid
	 */
	public static int genererSpillId() {

		Random rand = new Random();
		int maxNumber = 10000000;

		int randomNumber = rand.nextInt(maxNumber) + 1;

		return randomNumber;

	}

	
	/**
	 * 
	 * @param tom tabell av spillere
	 * @return tabell med opprettet spillere
	 */
	
	public static Spiller[] hentSpillere() {
		int ant = antallSpillere();

		Scanner console = new Scanner(System.in);

		Spiller[] spillere = new Spiller[ant];

		for (int i = 0; i < spillere.length; i++) {
			System.out.println("Skriv navnet til spiller"+(i+1));
			spillere[i] = new Spiller(console.nextLine());

		}


		return spillere;

	}

}
