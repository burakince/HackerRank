package net.burakince.hackerrank.w18.target;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase1() throws Exception {
		String systemInput = "5 6\n10 8 6 4 2\n0 0\n1 1\n2 2\n3 3\n4 4\n5 5\n";
		String expected = "22\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
