package net.burakince.hackerrank.cavity_map;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void shouldReplaceHighestNumbersWithX() throws Exception {
		String systemInput = "4\n"
							+ "1112\n"
							+ "1912\n"
							+ "1892\n"
							+ "1234\n";

		String expected = "1112\n"
						+ "1X12\n"
						+ "18X2\n"
						+ "1234\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
