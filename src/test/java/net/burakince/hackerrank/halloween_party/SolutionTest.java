package net.burakince.hackerrank.halloween_party;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenTakeDoubleNumber_shouldPrintHalfSquare() throws Exception {
		String systemInput = "1\n6\n";
		String expected = "9\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeSingleNumber_shouldPrintHalfTimesHalfPlusOne() throws Exception {
		String systemInput = "1\n7\n";
		String expected = "12\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeMoreThanOneTestCases() throws Exception {
		String systemInput = "4\n5\n6\n7\n8\n";
		String expected = "6\n9\n12\n16\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
