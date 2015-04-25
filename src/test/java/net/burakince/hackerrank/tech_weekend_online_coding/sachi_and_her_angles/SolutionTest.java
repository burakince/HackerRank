package net.burakince.hackerrank.tech_weekend_online_coding.sachi_and_her_angles;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import net.burakince.hackerrank.HacerRankTestCase;

import org.junit.Test;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void whenTakeThreeAngle_shouldTotalAngle180() throws Exception {
		String systemInput = "1\n3\n60 60 60\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeBiggerThanThreeAngle_shouldTotalAngle360() throws Exception {
		String systemInput = "1\n4\n89.5 90.5 90 90\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeBiggerThanThreeAngleAndTotalAngleNotEqual360_shouldReturnNo() throws Exception {
		String systemInput = "1\n4\n60 60 60 60\n";
		String expected = "NO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenTakeThreeTestCase_shouldReturnResults() throws Exception {
		String systemInput = "3\n3\n60 60 60\n4\n60 60 60 60\n4\n89.5 90.5 90 90\n";
		String expected = "YES\nNO\nYES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
