package net.burakince.hackerrank.plus_minus;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakePossitiveNumbersShouldCalculateThem() throws Exception {
		String systemInput = "6\n8 6 4 6 2 3\n";
		String expected = "1.000\n0.000\n0.000\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake3PossitiveAnd2NegativeAnd1ZeroNumbersShouldCalculateThem() throws Exception {
		String systemInput = "6\n-4 3 -9 0 4 1\n";
		String expected = "0.500\n0.333\n0.167\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
