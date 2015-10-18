package net.burakince.hackerrank.infinitum11.confused_gorilla;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTake0_shouldReturn1Path() throws Exception {
		String systemInput = "1\n0\n";
		String expected = "0 0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake1_shouldReturn2Path() throws Exception {
		String systemInput = "1\n1\n";
		String expected = "0 1\n1 0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake2_shouldReturn3Path() throws Exception {
		String systemInput = "1\n2\n";
		String expected = "0 2\n2 0\n1 1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake3_shouldReturn4Path() throws Exception {
		String systemInput = "1\n3\n";
		String expected = "0 3\n3 0\n1 2\n2 1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake4_shouldReturn5Path() throws Exception {
		String systemInput = "1\n4\n";
		String expected = "0 4\n4 0\n1 3\n3 1\n2 2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake5_shouldReturn6Path() throws Exception {
		String systemInput = "1\n5\n";
		String expected = "0 5\n5 0\n1 4\n4 1\n2 3\n3 2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake3TestCase_shouldPrintAllPaths() throws Exception {
		String systemInput = "3\n1\n2\n3\n";
		String expected = "0 1\n1 0\n0 2\n2 0\n1 1\n0 3\n3 0\n1 2\n2 1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
