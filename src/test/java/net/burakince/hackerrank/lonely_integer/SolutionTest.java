package net.burakince.hackerrank.lonely_integer;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenTakeSingleTestCase_shouldReturnIt() throws Exception {
		String systemInput = "1\n3\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThreeTestCase_shouldReturnLonelyInteger()
			throws Exception {
		String systemInput = "3\n1 2 1\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeFiveTestCase_shouldReturnLonelyInteger()
			throws Exception {
		String systemInput = "5\n0 0 1 2 1\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeTwoLonelyInteger_shouldReturnFirstOne()
			throws Exception {
		String systemInput = "9\n4 9 95 93 57 4 57 93 9\n";
		String expected = "95\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
