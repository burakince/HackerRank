package net.burakince.hackerrank.two_arrays;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_A_sum_B_bigger_or_equal_to_K_should_print_YES() throws Exception {
		String systemInput = "1\n"
							+ "3 10\n"
							+ "2 1 3\n"
							+ "7 8 9\n";

		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_A_sum_B_lower_than_K_should_print_NO() throws Exception {
		String systemInput = "1\n"
							+ "4 5\n"
							+ "1 2 2 1\n"
							+ "3 3 3 4\n";

		String expected = "NO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
