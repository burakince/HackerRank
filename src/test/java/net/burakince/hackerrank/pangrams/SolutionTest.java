package net.burakince.hackerrank.pangrams;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakePangramShouldPrintPangram() throws Exception {
		String systemInput = "We promptly judged antique ivory buckles for the next prize\n";
		String expected = "pangram\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeNotContainedEnglishCharsStringShouldPrintNotPangram() throws Exception {
		String systemInput = "We promptly judged antique ivory buckles for the prize\n";
		String expected = "not pangram\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}
}
