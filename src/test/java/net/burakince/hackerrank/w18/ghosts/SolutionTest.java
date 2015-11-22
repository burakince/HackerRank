package net.burakince.hackerrank.w18.ghosts;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_the_difference_between_the_town_number_and_the_street_number_is_divisible_by_3_should_ghost_lives() throws Exception {
		int towns = 4;
		int streets = 1;
		int houses = 4;
		int aparts = 1;

		assertTrue(Solution.isGhostLives(towns, streets, houses, aparts));
	}

	@Test
	public void when_the_sum_of_the_street_number_and_the_house_number_is_divisible_by_5_should_ghost_lives() throws Exception {
		int towns = 1;
		int streets = 1;
		int houses = 4;
		int aparts = 2;

		assertTrue(Solution.isGhostLives(towns, streets, houses, aparts));
	}

	@Test
	public void when_the_product_of_the_city_number_and_the_house_number_is_divisible_by_4_should_ghost_lives() throws Exception {
		int towns = 1;
		int streets = 1;
		int houses = 4;
		int aparts = 4;

		assertTrue(Solution.isGhostLives(towns, streets, houses, aparts));
	}

	@Test
	public void when_the_greatest_common_divisor_of_the_city_number_and_the_apartment_number_is_1_should_ghost_lives() throws Exception {
		int towns = 4;
		int streets = 4;
		int houses = 1;
		int aparts = 3;

		assertTrue(Solution.isGhostLives(towns, streets, houses, aparts));
	}

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "4 4 4 4\n";
		String expected = "8\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
