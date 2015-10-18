package net.burakince.hackerrank.weird_numbers;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HacerRankTestCase;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenTakeOddNumberShouldPrintWeird() throws Exception {
		String systemInput = "3\n";
		String expected = "Weird\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeHigherThan20ShouldPrintNotWeird() throws Exception {
		String systemInput = "24\n";
		String expected = "Not Weird\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
