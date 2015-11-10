package net.burakince.hackerrank.duplicate_word;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class DuplicateWordsTest extends HackerRankTestCase {

	@Test
	public void should_find_and_delete_duplicate_words() throws Exception {
		String systemInput = "3\nGoodbye bye bye world world world\nSwapnil went went to to to his business\nRana is is the the best player in eye eye game\n";
		String expected = "Goodbye bye world\nSwapnil went to his business\nRana is the best player in eye game\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		DuplicateWords.main(null);

		assertEquals(expected, outContent.toString());
	}

}
