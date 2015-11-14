package net.burakince.hackerrank.restaurant;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "1\n2 2\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_2() throws Exception {
		String systemInput = "1\n6 9\n";
		String expected = "6\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
