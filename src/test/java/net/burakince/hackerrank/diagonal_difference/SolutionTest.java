package net.burakince.hackerrank.diagonal_difference;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeOneSizeMatrixShouldReturnIt() throws Exception {
		String systemInput = "1\n10\n";
		String expected = "10\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeTwoSizeMatrixShouldCalculateIt() throws Exception {
		String systemInput = "2\n2 3\n4 6\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void shouldResultBePossitive() throws Exception {
		String systemInput = "2\n2 8\n6 4\n";
		String expected = "8\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThreeSizeMatrixShouldCalculateIt() throws Exception {
		String systemInput = "3\n2 3 4\n6 7 8\n10 12 13\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
