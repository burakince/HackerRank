package net.burakince.hackerrank.find_point;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_calculate_symmetric_point() throws Exception {
		String systemInput = "2\n0 0 1 1\n1 1 2 2\n";
		String expected = "2 2\n3 3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
