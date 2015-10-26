package net.burakince.hackerrank.taum_and_bday;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenNoBenefitToConvertingShouldUseOriginalPrices() throws Exception {
		String systemInput = "1\n10 10\n1 1 1\n";
		String expected = "20\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenWeCanNotDecreaseCostShouldUseOriginalPrices() throws Exception {
		String systemInput = "1\n5 9\n2 3 4\n";
		String expected = "37\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenConvertingCheaperThanOriginalCostShouldConvertGifts() throws Exception {
		String systemInput = "1\n3 6\n9 1 1\n";
		String expected = "12\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
