package net.burakince.hackerrank.codestorm.game_with_a_boomerang;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void sample1() throws Exception {
		String systemInput = "1\n2\n";

		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void sample2() throws Exception {
		String systemInput = "1\n3\n";

		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void sample3() throws Exception {
		String systemInput = "1\n4\n";

		String expected = "4\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void sample4() throws Exception {
		String systemInput = "1\n5\n";

		String expected = "5\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void sample5() throws Exception {
		String systemInput = "1\n10\n";

		String expected = "5\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void sample6() throws Exception {
		String systemInput = "1\n1000\n";

		String expected = "818\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
