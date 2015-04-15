package net.burakince.hackerrank.insertionsort1;

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
	public void shouldSwapFiveValues() throws Exception {
		String systemInput = "5\n2 4 6 8 3\n";
		String expected = "2 4 6 8 8 \n2 4 6 6 8 \n2 4 4 6 8 \n2 3 4 6 8 \n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void shouldSwapFourteenValues() throws Exception {
		String systemInput = "14\n1 3 5 9 13 22 27 35 46 51 55 83 87 23\n";
		String expected = "1 3 5 9 13 22 27 35 46 51 55 83 87 87 \n1 3 5 9 13 22 27 35 46 51 55 83 83 87 \n1 3 5 9 13 22 27 35 46 51 55 55 83 87 \n1 3 5 9 13 22 27 35 46 51 51 55 83 87 \n1 3 5 9 13 22 27 35 46 46 51 55 83 87 \n1 3 5 9 13 22 27 35 35 46 51 55 83 87 \n1 3 5 9 13 22 27 27 35 46 51 55 83 87 \n1 3 5 9 13 22 23 27 35 46 51 55 83 87 \n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void shouldSwapTenValues() throws Exception {
		String systemInput = "10\n2 3 4 5 6 7 8 9 10 1\n";
		String expected = "2 3 4 5 6 7 8 9 10 10 \n2 3 4 5 6 7 8 9 9 10 \n2 3 4 5 6 7 8 8 9 10 \n2 3 4 5 6 7 7 8 9 10 \n2 3 4 5 6 6 7 8 9 10 \n2 3 4 5 5 6 7 8 9 10 \n2 3 4 4 5 6 7 8 9 10 \n2 3 3 4 5 6 7 8 9 10 \n2 2 3 4 5 6 7 8 9 10 \n1 2 3 4 5 6 7 8 9 10 \n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
