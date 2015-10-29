package net.burakince.hackerrank.priyanka_and_toys;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_take_weight_and_4more() throws Exception {
		String systemInput = "5\n"
							+ "1 2 3 4 5\n";

		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_newweight_higher_than_weight_should_take_new_toy_and_recalculate_others() throws Exception {
		String systemInput = "10\n"
							+ "16 18 10 13 2 9 17 17 0 19\n";

		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
