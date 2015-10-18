package net.burakince.hackerrank.testing_volume;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HacerRankTestCase;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenChoiceOneShouldPrintCubeVolume() throws Exception {
		String systemInput = "1\n1\n4\n";
		String expected = "64.000\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenChoiceTwoShouldPrintCuboidVolume() throws Exception {
		String systemInput = "1\n2\n3\n4\n5\n";
		String expected = "60.000\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenChoiceThreeShouldPrintHemisphereVolume() throws Exception {
		String systemInput = "1\n3\n1.02\n";
		String expected = "2.223\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
