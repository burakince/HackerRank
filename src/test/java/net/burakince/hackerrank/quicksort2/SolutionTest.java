package net.burakince.hackerrank.quicksort2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "7\n5 8 1 3 7 9 2\n";
		String expected = "2 3\n1 2 3\n7 8 9\n1 2 3 5 7 8 9\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
