package net.burakince.hackerrank.sherlock_and_squares;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_count_integers_between_square_a_and_square_b() throws Exception {
		String systemInput = "2\n3 9\n17 24\n";
		String expected = "2\n0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
