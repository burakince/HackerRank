package net.burakince.hackerrank.sorting_tutorial_intro;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void shouldFindValueIndex() throws Exception {
		String systemInput = "4\n6\n1 4 5 7 9 12\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
