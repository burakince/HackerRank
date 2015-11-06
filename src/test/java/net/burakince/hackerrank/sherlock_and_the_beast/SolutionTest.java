package net.burakince.hackerrank.sherlock_and_the_beast;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_number_3_should_print_555() throws Exception {
		String systemInput = "1\n3\n";
		String expected = "555\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_number_5_should_print_33333() throws Exception {
		String systemInput = "1\n5\n";
		String expected = "33333\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_number_not_acceptable_should_print_negative_1() throws Exception {
		String systemInput = "1\n1\n";
		String expected = "-1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_calculate_all_permutations() throws Exception {
		String systemInput = "1\n11\n";
		String expected = "55555533333\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
