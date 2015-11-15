package net.burakince.hackerrank.bigger_is_greater;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase_1() throws Exception {
		String systemInput = "1\nab\n";
		String expected = "ba\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_2() throws Exception {
		String systemInput = "1\nbb\n";
		String expected = "no answer\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_3() throws Exception {
		String systemInput = "1\nhefg\n";
		String expected = "hegf\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_4() throws Exception {
		String systemInput = "1\ndhck\n";
		String expected = "dhkc\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase_5() throws Exception {
		String systemInput = "1\ndkhc\n";
		String expected = "hcdk\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
