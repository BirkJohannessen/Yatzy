package no.hvl.dat109.tester;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import no.hvl.dat109.spill.spillUtils;

public class spillUtilsTester {



	ArrayList<Integer> stemmerIkke = new ArrayList<>();
	ArrayList<Integer> stemmer = new ArrayList<>();
	ArrayList<Integer> litenStraight = new ArrayList<>();
	ArrayList<Integer> storStraight = new ArrayList<>();
	ArrayList<Integer> Hus = new ArrayList<>();
	ArrayList<Integer> AlleLike = new ArrayList<>();
	@Before
	public void setUp() throws Exception {
		
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
		
		storStraight.add(3);
		storStraight.add(2);
		storStraight.add(5);
		storStraight.add(6);
		storStraight.add(4);
		
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
		assertEquals(0, spillUtils.LitenStraight(Hus));
	}

	@Test
	public void testStorStraight() {
		assertEquals(20, spillUtils.StorStraight(storStraight));
		assertEquals(0, spillUtils.StorStraight(stemmerIkke));
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

}
