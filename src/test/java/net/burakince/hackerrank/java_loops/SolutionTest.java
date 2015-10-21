package net.burakince.hackerrank.java_loops;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void shouldCalculateFirstSampleInput() throws Exception {
		String systemInput = "1\n0 2 10\n";
		String expected = "2 6 14 30 62 126 254 510 1022 2046\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void shouldCalculateSecondSampleInput() throws Exception {
		String systemInput = "1\n5 3 5\n";
		String expected = "8 14 26 50 98\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
