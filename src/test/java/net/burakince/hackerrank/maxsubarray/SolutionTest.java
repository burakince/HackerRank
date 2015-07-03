package net.burakince.hackerrank.maxsubarray;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenTakePossitiveArrayShouldReturnContiguousMaxSubarray() throws Exception {
		String systemInput = "1\n4\n1 2 3 4\n";
		String expected = "10 10\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeNegativeArrayShouldReturnContiguousAndNotContiguousMaxSubarray() throws Exception {
		String systemInput = "1\n6\n2 -1 2 3 4 -5\n";
		String expected = "10 11\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
