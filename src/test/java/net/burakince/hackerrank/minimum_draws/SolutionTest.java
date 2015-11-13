package net.burakince.hackerrank.minimum_draws;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_a_pair_of_socks_present_should_exactly_2_draws_for_the_socks_to_match() throws Exception {
		String systemInput = "1\n1\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_2_pair_of_socks_present_in_the_drawer_should_first_and_second_different_color_and_thrid_one_of_previously_picked_socks() throws Exception {
		String systemInput = "1\n2\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
