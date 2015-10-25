package net.burakince.hackerrank.java_bigdecimal;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void shouldOrderBigDecimals() throws Exception {
		String systemInput = "9\n-100\n50\n0\n56.6\n90\n0.12\n.12\n02.34\n000.000\n";
		String expected = "90\n56.6\n50\n02.34\n0.12\n.12\n0\n000.000\n-100\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
