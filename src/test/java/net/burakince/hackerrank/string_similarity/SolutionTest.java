package net.burakince.hackerrank.string_similarity;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_calculate_similarities_with_z_algorithm() throws Exception {
		String systemInput = "2\nababaa\naa\n";
		String expected = "11\n3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
