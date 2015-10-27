package net.burakince.hackerrank.icecream_parlor;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void shouldSearchAllFlavorsForFindTotalCost() throws Exception {
		String systemInput = "1\n4\n5\n1 4 5 3 2\n";
		String expected = "1 4\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
