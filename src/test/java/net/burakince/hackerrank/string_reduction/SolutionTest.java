package net.burakince.hackerrank.string_reduction;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_all_numbers_a_or_b_or_c_should_print_length() throws Exception {
		String systemInput = "1\n"
							+ "ccccc\n";

		String expected = "5\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_all_even_number_should_print_2() throws Exception {
		String systemInput = "1\n"
							+ "abcabc\n";

		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_all_odd_number_should_print_2() throws Exception {
		String systemInput = "1\n"
							+ "abcabcabc\n";

		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_one_letter_count_mod_different_than_others_should_print_1() throws Exception {
		String systemInput = "1\n"
							+ "bbbbba\n";

		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
