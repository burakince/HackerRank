package net.burakince.hackerrank.tag_content_extractor;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void should_pass_testcase0() throws Exception {
		String systemInput = "4\n<h1>Nayeem loves counseling</h1>\n<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>\n<Amee>safat codes like a ninja</amee>\n<SA premium>Imtiaz has a secret crash</SA premium>\n";
		String expected = "Nayeem loves counseling\nSanjay has no watch\nNone\nImtiaz has a secret crash\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase1() throws Exception {
		String systemInput = "10\n<h1>some</h1>\n<h1>had<h1>public</h1></h1>\n<h1>had<h1>public</h1515></h1>\n<h1><h1></h1></h1>\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>\n<>hello</>\n<>hello</><h>dim</h>\n<>hello</><h>dim</h>>>>>\n";
		String expected = "some\npublic\nNone\nNone\nNone\nNone\nNone\nNone\ndim\ndim\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void should_pass_testcase7() throws Exception {
		String systemInput = "3\naaaaafasfdsfsfasgasgas\nfjdsklflasdfljl<><>\n<>hello<>\n";
		String expected = "None\nNone\nNone\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
