package net.burakince.hackerrank.java_datatypes;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeLongRangeValueShouldPrintLong() throws Exception {
		String systemInput = "1\n-100000000000000\n";
		String expected = "-100000000000000 can be fitted in:\n* long\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeIntRangeValueShouldPrintIntAndLong() throws Exception {
		String systemInput = "1\n1500000000\n";
		String expected = "1500000000 can be fitted in:\n* int\n* long\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeShortRangeValueShouldPrintShortAndIntAndLong() throws Exception {
		String systemInput = "1\n-150\n";
		String expected = "-150 can be fitted in:\n* short\n* int\n* long\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeByteRangeValueShouldPrintByteAndShortAndIntAndLong() throws Exception {
		String systemInput = "1\n1\n";
		String expected = "1 can be fitted in:\n* byte\n* short\n* int\n* long\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
