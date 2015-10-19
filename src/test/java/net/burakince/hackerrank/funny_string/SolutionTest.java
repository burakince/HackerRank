package net.burakince.hackerrank.funny_string;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeReversedValueShouldPrintFunny() throws Exception {
		String systemInput = "1\nacxz\n";
		String expected = "Funny\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeNotReversedValueShouldPrintNotFunny() throws Exception {
		String systemInput = "1\nbcxz\n";
		String expected = "Not Funny\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
