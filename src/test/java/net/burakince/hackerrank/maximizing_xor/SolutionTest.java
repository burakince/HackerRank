package net.burakince.hackerrank.maximizing_xor;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTake10And10_shouldGive0() throws Exception {
		String systemInput = "10\n10\n";
		String expected = "0";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake10And11_shouldGive1() throws Exception {
		String systemInput = "10\n11\n";
		String expected = "1";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake10And12_shouldGive7() throws Exception {
		String systemInput = "10\n12\n";
		String expected = "7";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake10And15_shouldGive7() throws Exception {
		String systemInput = "10\n15\n";
		String expected = "7";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
