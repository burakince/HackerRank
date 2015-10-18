package net.burakince.hackerrank.perfect_hiring;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeFirstHigherShouldReturnFirst() throws Exception {
		String systemInput = "4 94 8\n8 6 4 6\n";
		String expected = "1";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeSecondHigherShouldReturnSecond() throws Exception {
		String systemInput = "4 94 8\n1 8 1 1\n";
		String expected = "2";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThirdHigherShouldReturnThird() throws Exception {
		String systemInput = "4 94 8\n1 1 8 1\n";
		String expected = "3";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeFourthHigherShouldReturnFourth() throws Exception {
		String systemInput = "4 94 16\n1 1 1 8\n";
		String expected = "4";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeBigValuesShouldReturnResult() throws Exception {
		String systemInput = "10 1000000000 100\n1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000\n";
		String expected = "1";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
