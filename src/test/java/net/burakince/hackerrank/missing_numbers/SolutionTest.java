package net.burakince.hackerrank.missing_numbers;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase1() throws Exception {
		String systemInput = "10\n203 204 205 206 207 208 203 204 205 206\n13\n203 204 204 205 206 207 205 208 203 206 205 206 204\n\n";
		String expected = "204 205 206\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
