package net.burakince.hackerrank.filling_jars;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase0() throws Exception {
		String systemInput = "5 3\n1 2 100\n2 5 100\n3 4 100\n";
		String expected = "160\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase4() throws Exception {
		String expected = readStringLines(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("output04.txt"))));

		System.setIn(getClass().getResourceAsStream("input04.txt"));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
