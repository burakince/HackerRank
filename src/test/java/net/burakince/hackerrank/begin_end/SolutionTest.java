package net.burakince.hackerrank.begin_end;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeOneCharShouldReturn1() throws Exception {
		String systemInput = "1\na\n";
		String expected = "1";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake2SameCharShouldReturn3() throws Exception {
		String systemInput = "2\naa\n";
		String expected = "3";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake3SameCharShouldReturn6() throws Exception {
		String systemInput = "3\naaa\n";
		String expected = "6";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeabaCharsShouldReturn4() throws Exception {
		String systemInput = "3\naba\n";
		String expected = "4";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeababCharsShouldReturn6() throws Exception {
		String systemInput = "4\nabab\n";
		String expected = "6";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeababaCharsShouldReturn9() throws Exception {
		String systemInput = "5\nababa\n";
		String expected = "9";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeababacCharsShouldReturn10() throws Exception {
		String systemInput = "6\nababac\n";
		String expected = "10";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeababacaCharsShouldReturn14() throws Exception {
		String systemInput = "7\nababaca\n";
		String expected = "14";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}


}
