package net.burakince.hackerrank.cut_the_sticks;

import static org.junit.Assert.*;

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

	private Stick stick;

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
	public void whenTakeSixSticks_shouldCutWithMinimumlength() throws Exception {
		String systemInput = "6\n5 4 4 2 2 8\n";
		String expected = "6\n4\n2\n1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeEigthSticks_shouldCutWithMinimumlength() throws Exception {
		String systemInput = "8\n1 2 3 4 3 3 2 1\n";
		String expected = "8\n6\n4\n1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenCreateStick_shouldLengthEqualStartLength() throws Exception {
		stick = new Stick(3);

		assertEquals(3, stick.length());
	}

	@Test
	public void whenCutStick_shouldLengthLower() throws Exception {
		stick = new Stick(3);
		stick.cut(2);

		assertEquals(1, stick.length());
	}

	@Test
	public void whenCutStickLowerrThanLength_shouldHaveStick() throws Exception {
		stick = new Stick(3);
		stick.cut(2);

		assertEquals(false, stick.isNotLeft());
	}

	@Test
	public void whenCutStickHigherThanLength_shouldDontHaveStickAnymore() throws Exception {
		stick = new Stick(3);
		stick.cut(3);

		assertEquals(true, stick.isNotLeft());
	}

}
