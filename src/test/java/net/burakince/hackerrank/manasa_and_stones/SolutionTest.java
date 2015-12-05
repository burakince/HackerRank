package net.burakince.hackerrank.manasa_and_stones;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "1\n3\n1\n2\n";
		String expected = "2 3 4\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_2() throws Exception {
		String systemInput = "1\n4\n10\n100\n";
		String expected = "30 120 210 300\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
