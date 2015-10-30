package net.burakince.hackerrank.mark_and_toys;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_buy_all_lower_price_toys() throws Exception {
		String systemInput = "7 50\n1 12 5 111 200 1000 10\n";
		String expected = "4\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
