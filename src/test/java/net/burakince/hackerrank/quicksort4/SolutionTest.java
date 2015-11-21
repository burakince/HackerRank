package net.burakince.hackerrank.quicksort4;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase0() throws Exception {
		String systemInput = "7\n1 3 9 8 2 7 5\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase1() throws Exception {
		String systemInput = "10\n10 9 8 7 6 5 4 3 2 1\n";
		String expected = "16\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase2() throws Exception {
		String systemInput = "10\n1 3 4 5 2 7 8 9 6 10\n";
		String expected = "-16\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
