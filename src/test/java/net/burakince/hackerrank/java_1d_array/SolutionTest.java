package net.burakince.hackerrank.java_1d_array;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenJumpMoveableSouldMove() throws Exception {
		String systemInput = "1\n5 3\n0 0 0 0 0\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenNextMoveableSouldMove() throws Exception {
		String systemInput = "1\n6 5\n0 0 0 1 1 1\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenBackMoveableSouldMove() throws Exception {
		String systemInput = "1\n7 3\n0 1 0 0 1 0 1\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenFirstPositionNotMoveableSouldBreak() throws Exception {
		String systemInput = "1\n2 1\n1 0\n";
		String expected = "NO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void testCase3() throws Exception {
		String expected = readStringLines(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("output03.txt"))));

		System.setIn(getClass().getResourceAsStream("input03.txt"));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void lastTestCase() throws Exception {
		String systemInput = "1\n86 52\n0 1 1 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0 0 0 1 0 1 0 0 0 1 0 0 0 0 1 0 1 1 1 0 0 0 0 1 1 0 0 1 1 1 0 1 0 0 0 0 1 1 1 1 0 1 1 0 1 1 0 0 0 0 0 0 0 0 1 1 1 1 0 0 1 0 1 1 0 0 1 0 1\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
