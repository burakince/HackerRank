package net.burakince.hackerrank.the_time_in_words;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_minutes_0_should_print_oclock() throws Exception {
		String systemInput = "5\n00\n";
		String expected = "five o' clock\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_minutes_1_should_print_past() throws Exception {
		String systemInput = "5\n01\n";
		String expected = "one minute past five\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_minutes_15_should_print_quarter_past() throws Exception {
		String systemInput = "5\n15\n";
		String expected = "quarter past five\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_minutes_30_should_print_half_past() throws Exception {
		String systemInput = "5\n30\n";
		String expected = "half past five\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_minutes_40_should_print_to() throws Exception {
		String systemInput = "5\n40\n";
		String expected = "twenty minutes to six\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_minutes_45_should_print_quarter_to() throws Exception {
		String systemInput = "5\n45\n";
		String expected = "quarter to six\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
