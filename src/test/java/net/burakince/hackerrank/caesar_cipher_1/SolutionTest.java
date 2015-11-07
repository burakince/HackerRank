package net.burakince.hackerrank.caesar_cipher_1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_use_caesar_encryption() throws Exception {
		String systemInput = "11\nmiddle-Outz\n2\n";
		String expected = "okffng-Qwvb\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
