package net.burakince.hackerrank.dance_in_pairs;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenTakeOneArgShouldReturn1() throws Exception {
		String systemInput = "1 10\n1\n11\n";
		String expected = "1";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeTwoArgsShouldReturn2() throws Exception {
		String systemInput = "2 10\n1 2\n12 11\n";
		String expected = "2";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThreeArgsWithOneWrongShouldReturn2() throws Exception {
		String systemInput = "3 10\n1 2 3\n12 11 101\n";
		String expected = "2";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
