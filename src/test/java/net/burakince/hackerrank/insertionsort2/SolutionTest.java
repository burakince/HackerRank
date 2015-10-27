package net.burakince.hackerrank.insertionsort2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void shouldSortWithInsertionSort() throws Exception {
		String systemInput = "6\n1 4 3 5 6 2\n";
		String expected = "1 4 3 5 6 2 \n"
						+ "1 3 4 5 6 2 \n"
						+ "1 3 4 5 6 2 \n"
						+ "1 3 4 5 6 2 \n"
						+ "1 2 3 4 5 6 \n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
