package net.burakince.hackerrank.game_of_thrones;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_length_odd_should_one_odd_and_others_even() throws Exception {
		String systemInput = "aaabbbb\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_length_even_should_no_odd() throws Exception {
		String systemInput = "cdcdcdcdeeee\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_length_even_and_has_odd_should_print_no() throws Exception {
		String systemInput = "cdefghmnopqrstuvw\n";
		String expected = "NO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
