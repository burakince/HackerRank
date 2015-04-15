package net.burakince.hackerrank.halloween_party;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private static final InputStream STDIN = System.in;
	private static final PrintStream OUT = System.out;
	private static final PrintStream ERR = System.err;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
		System.err.flush();
		System.out.flush();

		System.setOut(OUT);
		System.setErr(ERR);
		System.setIn(STDIN);
	}

	@Test
	public void whenTakeDoubleNumber_shouldPrintHalfSquare() throws Exception {
		String systemInput = "1\n6\n";
		String expected = "9\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeSingleNumber_shouldPrintHalfTimesHalfPlusOne() throws Exception {
		String systemInput = "1\n7\n";
		String expected = "12\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeMoreThanOneTestCases() throws Exception {
		String systemInput = "4\n5\n6\n7\n8\n";
		String expected = "6\n9\n12\n16\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
