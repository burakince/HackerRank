package net.burakince.hackerrank.connecting_towns;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "1\n3\n1 3\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_2() throws Exception {
		String systemInput = "1\n4\n2 2 2\n";
		String expected = "8\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
