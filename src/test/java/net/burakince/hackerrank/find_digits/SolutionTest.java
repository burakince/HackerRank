package net.burakince.hackerrank.find_digits;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeSixSticks_shouldCutWithMinimumlength() throws Exception {
		String systemInput = "2\n12\n1012\n";
		String expected = "2\n3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
