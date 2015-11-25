package net.burakince.hackerrank.w18.gg;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase1() throws Exception {
		String systemInput = "3 100\nGG\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
