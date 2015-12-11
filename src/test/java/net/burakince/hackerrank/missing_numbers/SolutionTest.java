package net.burakince.hackerrank.missing_numbers;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase0() throws Exception {
		String systemInput = "10\n203 204 205 206 207 208 203 204 205 206\n13\n203 204 204 205 206 207 205 208 203 206 205 206 204\n\n";
		String expected = "204 205 206\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase1() throws Exception {
		String expected = readStringLines(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("output01.txt"))));

		System.setIn(getClass().getResourceAsStream("input01.txt"));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase3() throws Exception {
		String expected = readStringLines(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("output03.txt"))));

		System.setIn(getClass().getResourceAsStream("input03.txt"));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
