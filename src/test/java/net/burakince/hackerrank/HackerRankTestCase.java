package net.burakince.hackerrank;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

public class HackerRankTestCase {

	private static final InputStream STDIN = System.in;
	private static final PrintStream OUT = System.out;
	private static final PrintStream ERR = System.err;

	protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	protected final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

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

	public String readStringLines(BufferedReader buffIn) throws IOException {
		StringBuilder everything = new StringBuilder();
		String line;
		while ((line = buffIn.readLine()) != null) {
			everything.append(line).append('\n');
		}
		return everything.toString();
	}

}