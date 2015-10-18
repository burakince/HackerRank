package net.burakince.hackerrank.angry_professor;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenStudentsOnTime_shouldClassNotCancel() throws Exception {
		String systemInput = "1\n4 2\n0 -1 2 1\n";
		String expected = "NO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenStudentsNotOnTime_shouldClassCancel() throws Exception {
		String systemInput = "1\n4 3\n-1 -3 4 2\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void shouldWorkWithTwoTestCases() throws Exception {
		String systemInput = "2\n4 3\n-1 -3 4 2\n4 2\n0 -1 2 1\n";
		String expected = "YES\nNO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
