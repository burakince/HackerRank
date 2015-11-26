package net.burakince.hackerrank.java_annotations;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase1() throws Exception {
		String systemInput = "3\nSENIOR 75\nJUNIOR 45\nSENIOR 40\n";
		String expected = "Senior Member\nSpend: 75\nBudget Left: 25\nJunior Member\nSpend: 45\nBudget Left: 5\nSenior Member\nSpend: 40\nBudget Left: 60\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
