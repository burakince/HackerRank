package net.burakince.hackerrank.handshake;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_lonely_board_member_should_shakes_no_hands() throws Exception {
		String systemInput = "1\n1\n";
		String expected = "0\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_more_than_one_board_members_should_shakes_hands() throws Exception {
		String systemInput = "1\n4\n";
		String expected = "6\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
