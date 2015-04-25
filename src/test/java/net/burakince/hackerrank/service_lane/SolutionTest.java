package net.burakince.hackerrank.service_lane;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenServiceLaneWidth1_shouldPassBike() throws Exception {
		String systemInput = "2 1\n1 1\n0 1\n";
		String expected = "1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenServiceLaneWidth2_shouldPassCar() throws Exception {
		String systemInput = "2 1\n2 2\n0 1\n";
		String expected = "2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenServiceLaneWidth3_shouldPassTruck() throws Exception {
		String systemInput = "2 1\n3 3\n0 1\n";
		String expected = "3\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenServiceContainLowerWidth_shouldPassLowerVehicle() throws Exception {
		String systemInput = "3 2\n3 2 3\n0 1\n1 2\n";
		String expected = "2\n2\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void sampleTestShouldPass() throws Exception {
		String systemInput = "8 5\n2 3 1 2 3 2 3 3\n0 3\n4 6\n6 7\n3 5\n0 7\n";
		String expected = "1\n2\n3\n2\n1\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
