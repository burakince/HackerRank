package net.burakince.hackerrank.can_you_access;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_access_private_method() throws Exception {
		String systemInput = "8\n";
		String expected = "8 is power of 2\nAn instance of class: net.burakince.hackerrank.can_you_access.Solution.Inner.Private has been created\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
