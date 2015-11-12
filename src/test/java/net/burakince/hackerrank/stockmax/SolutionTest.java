package net.burakince.hackerrank.stockmax;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_cannot_obtain_any_profit_should_not_buy_share() throws Exception {
		String systemInput = "1\n3\n5 3 2\n";
		String expected = "0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_can_obtain_profit_should_buy_share() throws Exception {
		String systemInput = "1\n4\n1 3 1 2\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_can_obtain_more_profit_should_buy_all_shares() throws Exception {
		String systemInput = "1\n3\n1 2 100\n";
		String expected = "197\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
