package net.burakince.hackerrank.maximizing_xor;

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
