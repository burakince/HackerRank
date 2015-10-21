package net.burakince.hackerrank.java_anagrams;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeAnagramsShouldPrintAnagrams() throws Exception {
		String systemInput = "anagram\nmargana\n";
		String expected = "Anagrams\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeNotAnagramsShouldPrintNotAnagrams() throws Exception {
		String systemInput = "anagramm\nmarganaa\n";
		String expected = "Not Anagrams\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
