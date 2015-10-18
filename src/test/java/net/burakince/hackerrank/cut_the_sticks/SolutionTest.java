package net.burakince.hackerrank.cut_the_sticks;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HackerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HackerRankTestCase {

	private Stick stick;

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
