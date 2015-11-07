package net.burakince.hackerrank.encryption;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_sample_1() throws Exception {
		String systemInput = "have a nice day\n";
		String expected = "hae and via ecy\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_sample_2() throws Exception {
		String systemInput = "feed the dog    \n";
		String expected = "fto ehg ee dd\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_sample_3() throws Exception {
		String systemInput = "chill out\n";
		String expected = "clu hlt io\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_sample_4() throws Exception {
		String systemInput = "if man was meant to stay on the ground god would have given us roots\n";
		String expected = "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
