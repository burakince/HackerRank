package net.burakince.hackerrank.valid_username_checker;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeAlphanumericAndUnderscoreShouldPrintValid() throws Exception {
		String systemInput = "1\nalpha_naheed\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenStartWithUnderscoreShouldPrintValid() throws Exception {
		String systemInput = "1\n_naheedas\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenEndWithUnderscoreShouldPrintValid() throws Exception {
		String systemInput = "1\nnaheedas_\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenStartAndEndWithUnderscoreShouldPrintInvalid() throws Exception {
		String systemInput = "1\n_naheedas_\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenEndWithNumberShouldPrintValid() throws Exception {
		String systemInput = "1\nnaheedas132123\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeAtShouldPrintInvalid() throws Exception {
		String systemInput = "1\nnagib@007\n";
		String expected = "Invalid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenStartWithNumberShouldPrintInvalid() throws Exception {
		String systemInput = "1\n123Swakkhar\n";
		String expected = "Invalid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenLengthLowerThan8ShouldPrintInvalid() throws Exception {
		String systemInput = "1\nabcdabc\n";
		String expected = "Invalid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenLengthHigherThan30ShouldPrintInvalid() throws Exception {
		String systemInput = "1\nabcdeabcdeabcdeabcdeabcdeabcdea\n";
		String expected = "Invalid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeTwoUnderscoreShouldPrintInvalid() throws Exception {
		String systemInput = "1\nalpha__naheed\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThreeUnderscoreShouldPrintInvalid() throws Exception {
		String systemInput = "1\nabcd123_12_1212asa\n";
		String expected = "Valid\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
