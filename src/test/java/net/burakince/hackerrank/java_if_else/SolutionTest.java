package net.burakince.hackerrank.java_if_else;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_n_is_odd_should_print_weird() throws Exception {
		String systemInput = "3\n";
		String expected = "Weird\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_n_is_even_and_between_2_and_5_should_print_not_weird() throws Exception {
		String systemInput = "4\n";
		String expected = "Not Weird\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_n_is_even_and_between_6_and_20_should_print_weird() throws Exception {
		String systemInput = "14\n";
		String expected = "Weird\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_n_is_even_and_grater_than_20_should_print_not_weird() throws Exception {
		String systemInput = "22\n";
		String expected = "Not Weird\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
