package net.burakince.hackerrank.java_stack;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenParanthesNotClosedShouldPrintFalse() throws Exception {
		String systemInput = "(\n";
		String expected = "false\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenParanthesClosedShouldPrintTrue() throws Exception {
		String systemInput = "()\n";
		String expected = "true\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenBracketsInsideOfParanthesShouldPrintTrue() throws Exception {
		String systemInput = "([])\n";
		String expected = "true\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeBracketsWrongOrderShouldPrintFalse() throws Exception {
		String systemInput = "([)]\n";
		String expected = "false\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
