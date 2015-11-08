package net.burakince.hackerrank.morgan_and_a_string;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "1\nJACK\nDANIEL\n";
		String expected = "DAJACKNIEL\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_2() throws Exception {
		String systemInput = "1\nABACABA\nABACABA\n";
		String expected = "AABABACABACABA\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_3() throws Exception {
		String systemInput = "1\nCAJA\nCABA\n";
		String expected = "CABACAJA\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_5() throws Exception {
		String expected = readStringLines(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("output05.txt"))));

		System.setIn(getClass().getResourceAsStream("input05.txt"));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_10() throws Exception {
		String expected = readStringLines(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("output10.txt"))));

		System.setIn(getClass().getResourceAsStream("input10.txt"));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
