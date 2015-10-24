package net.burakince.hackerrank.java_arraylist;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenFoundItShouldReturnIt() throws Exception {
		String systemInput = "1\n1\n10\n1\n1 1\n";
		String expected = "10\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenNotFoundItShouldPrintError() throws Exception {
		String systemInput = "5\n5 41 77 74 22 44\n1 12\n4 37 34 36 52\n0\n3 20 22 33\n5\n1 3\n3 4\n3 1\n4 3\n5 5\n";
		String expected = "74\n52\n37\nERROR!\nERROR!\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
