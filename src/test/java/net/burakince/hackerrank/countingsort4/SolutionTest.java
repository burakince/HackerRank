package net.burakince.hackerrank.countingsort4;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_test1() throws Exception {
		String systemInput = "20\n0 ab\n6 cd\n0 ef\n6 gh\n4 ij\n0 ab\n6 cd\n0 ef\n6 gh\n0 ij\n4 that\n3 be\n0 to\n1 be\n5 question\n1 or\n2 not\n4 is\n2 to\n4 the\n";
		String expected = "- - - - - to be or not to be - that is the question - - - -\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
