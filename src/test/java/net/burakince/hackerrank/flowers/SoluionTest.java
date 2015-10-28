package net.burakince.hackerrank.flowers;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SoluionTest extends HackerRankTestCase {

	@Test
	public void whenFlowersNumberEqualToPeopleShouldEveryoneBuyOnce() throws Exception {
		String systemInput = "3 3\n2 5 6\n";
		String expected = "13\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenFlowersNumberHigherThanPeopleShouldCalculateRemain() throws Exception {
		String systemInput = "3 2\n2 5 6\n";
		String expected = "15\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
