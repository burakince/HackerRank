package net.burakince.hackerrank.library_fine;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_book_is_returned_on_expected_return_date_should_fine_0() throws Exception {
		String systemInput = "9 6 2015\n9 6 2015\n";
		String expected = "0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_book_is_returned_before_expected_return_date_should_fine_0() throws Exception {
		String systemInput = "8 6 2015\n9 6 2015\n";
		String expected = "0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_book_is_not_returned_in_the_same_calendar_year_should_fine_10000() throws Exception {
		String systemInput = "9 6 2016\n9 6 2015\n";
		String expected = "10000\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_book_is_not_returned_in_the_same_calendar_month_should_fine_monthX500() throws Exception {
		String systemInput = "9 9 2015\n9 6 2015\n";
		String expected = "1500\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_book_is_not_returned_in_the_same_calendar_dat_should_fine_numberOfLateDaysX15() throws Exception {
		String systemInput = "21 6 2015\n9 6 2015\n";
		String expected = "180\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
