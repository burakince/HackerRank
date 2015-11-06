package net.burakince.hackerrank.greedy_max_min;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_calculate_sample1() throws Exception {
		String systemInput = "7\n3\n10\n100\n300\n200\n1000\n20\n30\n";
		String expected = "20\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_calculate_sample2() throws Exception {
		String systemInput = "10\n4\n1\n2\n3\n4\n10\n20\n30\n40\n100\n200\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_calculate_sample3() throws Exception {
		String systemInput = "6\n3\n10\n20\n30\n100\n101\n102\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
