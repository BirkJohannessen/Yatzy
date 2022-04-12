package no.hvl.dat109.tester;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import no.hvl.dat109.spill.Spiller;
import no.hvl.dat109.spill.spillUtils;

public class spillUtilsTester {



	ArrayList<Integer> stemmerIkke = new ArrayList<>();
	ArrayList<Integer> stemmer = new ArrayList<>();
	ArrayList<Integer> litenStraight = new ArrayList<>();
	ArrayList<Integer> randomLitenStraight = new ArrayList<>();
	ArrayList<Integer> randomStorStraight = new ArrayList<>();
	ArrayList<Integer> storStraight = new ArrayList<>();
	ArrayList<Integer> Hus = new ArrayList<>();
	ArrayList<Integer> AlleLike = new ArrayList<>();
	Spiller spiller1 = new Spiller("Andreas");
	Spiller spiller2 = new Spiller("Tor");
	Spiller spiller3 = new Spiller("Ole");
	Spiller[] liste1 = new Spiller[3];
	Spiller[] liste2 = new Spiller[2];
	Spiller[] liste3 = new Spiller[1];
	@Before
	public void setUp() throws Exception {
		
		spiller1.setScore(0, 3);
		spiller1.setScore(1, 6);
		spiller1.setScore(2, 6);
		spiller1.setScore(3, 0);
		spiller1.setScore(4, 10);
		spiller1.setScore(5, 18);
		spiller1.setScore(6, 43);
		spiller1.setScore(7, 4);
		spiller1.setScore(8, 12);
		spiller1.setScore(9, 0);
		spiller1.setScore(10, 10);
		spiller1.setScore(11, 18);
		spiller1.setScore(12, 3);
		spiller1.setScore(13, 0);
		spiller1.setScore(14, 10);
		spiller1.setScore(15, 143);
		
		
		
		spiller2.setScore(0, 2);
		spiller2.setScore(1, 4);
		spiller2.setScore(2, 3);
		spiller2.setScore(3, 0);
		spiller2.setScore(4, 10);
		spiller2.setScore(5, 18);
		spiller2.setScore(6, 37);
		spiller2.setScore(7, 4);
		spiller2.setScore(8, 12);
		spiller2.setScore(9, 0);
		spiller2.setScore(10, 10);
		spiller2.setScore(11, 18);
		spiller2.setScore(12, 3);
		spiller2.setScore(13, 0);
		spiller2.setScore(14, 10);
		spiller2.setScore(15, 131);
		
		

		spiller3.setScore(0, 4);
		spiller3.setScore(1, 2);
		spiller3.setScore(2, 3);
		spiller3.setScore(3, 4);
		spiller3.setScore(4, 5);
		spiller3.setScore(5, 12);
		spiller3.setScore(6, 30);
		spiller3.setScore(7, 4);
		spiller3.setScore(8, 3);
		spiller3.setScore(9, 0);
		spiller3.setScore(10, 10);
		spiller3.setScore(11, 18);
		spiller3.setScore(12, 3);
		spiller3.setScore(13, 0);
		spiller3.setScore(14, 10);
		spiller3.setScore(15, 108);
	
		
		stemmerIkke.add(1);
		stemmerIkke.add(5);
		stemmerIkke.add(5);
		stemmerIkke.add(2);
		stemmerIkke.add(3);
	
		stemmer.add(1);
		stemmer.add(5);
		stemmer.add(5);
		stemmer.add(5);
		stemmer.add(5);
		
		litenStraight.add(1);
		litenStraight.add(2);
		litenStraight.add(5);
		litenStraight.add(3);
		litenStraight.add(4);
		
		randomLitenStraight.add(2);
		randomLitenStraight.add(1);
		randomLitenStraight.add(3);
		randomLitenStraight.add(5);
		randomLitenStraight.add(4);
		
		storStraight.add(3);
		storStraight.add(2);
		storStraight.add(5);
		storStraight.add(6);
		storStraight.add(4);
		
		randomStorStraight.add(3);
		randomStorStraight.add(6);
		randomStorStraight.add(2);
		randomStorStraight.add(4);
		randomStorStraight.add(5);
		
		Hus.add(2);
		Hus.add(2);
		Hus.add(2);
		Hus.add(5);
		Hus.add(5);
		
		AlleLike.add(4);
		AlleLike.add(4);
		AlleLike.add(4);
		AlleLike.add(4);
		AlleLike.add(4);
		
		liste1[0] = spiller3;
		liste1[1] = spiller2;
		liste1[2] = spiller1;
		
		liste2[0] = spiller2;
		liste2[1] = spiller3;
		
		liste3[0] = spiller3;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTreLike() {
	
		assertEquals(15, spillUtils.TreLike(stemmer));
		assertEquals(6, spillUtils.TreLike(Hus));
		assertEquals(0, spillUtils.TreLike(stemmerIkke));
	}

	@Test
	public void testFireLike() {
		
		assertEquals(20, spillUtils.FireLike(stemmer));
		assertEquals(0, spillUtils.FireLike(Hus));
		assertEquals(0, spillUtils.FireLike(stemmerIkke));
	}

	@Test
	public void testLitenStraight() {
		assertEquals(15, spillUtils.LitenStraight(litenStraight));
		assertEquals(0, spillUtils.LitenStraight(stemmerIkke));
		assertEquals(15, spillUtils.LitenStraight(randomLitenStraight));
		assertEquals(0, spillUtils.LitenStraight(Hus));
	}

	@Test
	public void testStorStraight() {
		assertEquals(20, spillUtils.StorStraight(storStraight));
		assertEquals(0, spillUtils.StorStraight(stemmerIkke));
		assertEquals(20, spillUtils.StorStraight(randomStorStraight));
		assertEquals(0, spillUtils.StorStraight(Hus));
	}

	@Test
	public void testSjanse() {
		assertEquals(20, spillUtils.Sjanse(storStraight));
		assertEquals(16, spillUtils.Sjanse(stemmerIkke));
		assertEquals(21, spillUtils.Sjanse(stemmer));
	}

	@Test
	public void testHus() {
		assertEquals(0, spillUtils.Hus(storStraight));
		assertEquals(0, spillUtils.Hus(stemmerIkke));
		assertEquals(16, spillUtils.Hus(Hus));
	}

	@Test
	public void testYatzhee() {
		assertEquals(0, spillUtils.Yatzhee(litenStraight));
		assertEquals(50, spillUtils.Yatzhee(AlleLike));
		assertEquals(0, spillUtils.Yatzhee(Hus));
	}
	@Test
	public void testSum() {
		assertEquals(43, spillUtils.sum(spiller1));
		assertEquals(37, spillUtils.sum(spiller2));
		assertEquals(30, spillUtils.sum(spiller3));
	}
	@Test
	public void totalScore() {
		assertEquals(143, spillUtils.totalScore(spiller1));
		assertEquals(131, spillUtils.totalScore(spiller2));
		assertEquals(108, spillUtils.totalScore(spiller3));
	}
	@Test
	public void finneSpiller() {
		assertEquals(spiller1, spillUtils.finneVinner(liste1));
		assertEquals(spiller2, spillUtils.finneVinner(liste2));
		assertEquals(spiller3, spillUtils.finneVinner(liste3));
	}

}
