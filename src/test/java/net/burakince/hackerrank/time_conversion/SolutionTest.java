package net.burakince.hackerrank.time_conversion;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_convert_24_hour_format() throws Exception {
		String systemInput = "07:05:45PM\n";
		String expected = "19:05:45\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_convert_midnight() throws Exception {
		String systemInput = "12:00:00AM\n";
		String expected = "00:00:00\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_convert_noon() throws Exception {
		String systemInput = "12:00:00PM\n";
		String expected = "12:00:00\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
