package net.burakince.hackerrank.chocolate_feast;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_print_eated_chocolates() throws Exception {
		String systemInput = "1\n11 2 10\n";
		String expected = "5\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_buy_chocolates_with_wrappers() throws Exception {
		String systemInput = "1\n6 2 3\n";
		String expected = "4\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_use_unused_wrappers() throws Exception {
		String systemInput = "1\n43203 60 5\n";
		String expected = "899\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
