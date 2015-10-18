package net.burakince.hackerrank.compare_the_players;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HacerRankTestCase;

public class SolutionTest extends HacerRankTestCase {

	@Test
	public void shouldPrintHigherScoreFirst() throws Exception {
		String systemInput = "2\naakansha 75\naleksa 150\n";
		String expected = "aleksa 150\naakansha 75\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void whenScoresSameShouldPrintLexicographicallyFirst() throws Exception {
		String systemInput = "2\namy 100\ndavid 100\n";
		String expected = "david 100\namy 100\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
