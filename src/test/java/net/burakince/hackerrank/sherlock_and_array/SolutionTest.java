package net.burakince.hackerrank.sherlock_and_array;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_left_side_sum_equal_to_right_side() throws Exception {
		String systemInput = "1\n4\n1 2 3 3\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_size_one_should_print_yes() throws Exception {
		String systemInput = "1\n1\n1\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_right_side_sum_equal_to_left_side() throws Exception {
		String systemInput = "1\n5\n102 1 100 1 1\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_calculate_multiple_test_cases() throws Exception {
		String systemInput = "10\n1\n1\n1\n2\n1\n3\n2\n1 2\n3\n1 4 1\n3\n1 5 1\n1\n234\n1\n20000\n3\n6 23 6\n1\n1\n";
		String expected = "YES\nYES\nYES\nNO\nYES\nYES\nYES\nYES\nYES\nYES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
