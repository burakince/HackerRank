package net.burakince.hackerrank.lonely_integer;

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
	public void whenTakeSingleTestCase_shouldReturnIt() throws Exception {
		String systemInput = "1\n3\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThreeTestCase_shouldReturnLonelyInteger()
			throws Exception {
		String systemInput = "3\n1 2 1\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeFiveTestCase_shouldReturnLonelyInteger()
			throws Exception {
		String systemInput = "5\n0 0 1 2 1\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeTwoLonelyInteger_shouldReturnFirstOne()
			throws Exception {
		String systemInput = "9\n4 9 95 93 57 4 57 93 9\n";
		String expected = "95\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
