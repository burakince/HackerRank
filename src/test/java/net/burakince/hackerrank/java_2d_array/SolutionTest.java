package net.burakince.hackerrank.java_2d_array;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void whenTakeHourglassUsingTheNumberOneWithinAnArrayFullOfZerosShouldReturnSum() throws Exception {
		String systemInput = "1 1 1 0 0 0\n";
		systemInput +=       "0 1 0 0 0 0\n";
		systemInput +=       "1 1 1 0 0 0\n";
		systemInput +=       "0 0 0 0 0 0\n";
		systemInput +=       "0 0 0 0 0 0\n";
		systemInput +=       "0 0 0 0 0 0\n";

		String expected = "7\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeTwoHourglassShouldReturnSumOfHigherOne() throws Exception {
		String systemInput = "1 1 1 0 0 0\n";
		systemInput +=       "0 1 0 0 0 0\n";
		systemInput +=       "1 1 1 0 0 0\n";
		systemInput +=       "0 0 2 4 4 0\n";
		systemInput +=       "0 0 0 2 0 0\n";
		systemInput +=       "0 0 1 2 4 0\n";

		String expected = "19\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
