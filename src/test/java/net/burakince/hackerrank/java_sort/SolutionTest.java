package net.burakince.hackerrank.java_sort;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_order_by_cgpa() throws Exception {
		String systemInput = "2\n33 Rumpa 3.68\n85 Ashis 3.85\n";
		String expected = "Ashis\nRumpa\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_same_cgpa_should_order_by_name() throws Exception {
		String systemInput = "2\n33 Rumpa 3.65\n85 Ashis 3.65\n";
		String expected = "Ashis\nRumpa\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_same_name_should_order_by_id() throws Exception {
		String systemInput = "2\n33 Rumpa 3.65\n85 Rumpa 3.65\n";
		String expected = "Rumpa\nRumpa\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
