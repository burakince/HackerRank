package net.burakince.hackerrank.java_1d_array_easy;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeOneNegativeElementShouldPrintIt() throws Exception {
		String systemInput = "1\n-1\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void shouldCountAllNegativeSubarrays() throws Exception {
		String systemInput = "5\n1 -2 4 -5 1\n";
		String expected = "9\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
