package net.burakince.hackerrank.infinitum11.confused_gorilla;

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
	public void whenTake0_shouldReturn1Path() throws Exception {
		String systemInput = "1\n0\n";
		String expected = "0 0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake1_shouldReturn2Path() throws Exception {
		String systemInput = "1\n1\n";
		String expected = "0 1\n1 0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake2_shouldReturn3Path() throws Exception {
		String systemInput = "1\n2\n";
		String expected = "0 2\n2 0\n1 1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake3_shouldReturn4Path() throws Exception {
		String systemInput = "1\n3\n";
		String expected = "0 3\n3 0\n1 2\n2 1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake4_shouldReturn5Path() throws Exception {
		String systemInput = "1\n4\n";
		String expected = "0 4\n4 0\n1 3\n3 1\n2 2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake5_shouldReturn6Path() throws Exception {
		String systemInput = "1\n5\n";
		String expected = "0 5\n5 0\n1 4\n4 1\n2 3\n3 2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTake3TestCase_shouldPrintAllPaths() throws Exception {
		String systemInput = "3\n1\n2\n3\n";
		String expected = "0 1\n1 0\n0 2\n2 0\n1 1\n0 3\n3 0\n1 2\n2 1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
