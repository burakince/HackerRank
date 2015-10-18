package net.burakince.hackerrank.infinitum11.prime_factorization_2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTake6_shouldReturn5() throws Exception {
		String systemInput = "1\n6\n";
		String expected = "5\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake9_shouldReturn6() throws Exception {
		String systemInput = "1\n9\n";
		String expected = "6\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake12_shouldReturn7() throws Exception {
		String systemInput = "1\n12\n";
		String expected = "7\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake17_shouldReturn17() throws Exception {
		String systemInput = "1\n17\n";
		String expected = "17\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake5040_shouldReturn26() throws Exception {
		String systemInput = "1\n5040\n";
		String expected = "26\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake6_9_12_17_5040_shouldReturn61() throws Exception {
		String systemInput = "5\n6\n9\n12\n17\n5040\n";
		String expected = "61\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
