package net.burakince.hackerrank.prime_checker;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_print_prime_numbers() throws Exception {
		String systemInput = "2\n1\n3\n4\n5\n";
		String expected = "2\n2\n2 3\n2 3 5\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
