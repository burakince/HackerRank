package net.burakince.hackerrank.the_grid_search;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import net.burakince.hackerrank.HackerRankTestCase;

public class SolutionTest extends HackerRankTestCase {

	@Test
	public void when_found_grid_in_larger_grid_should_print_yes() throws Exception {
		String systemInput = "1\n10 10\n7283455864\n6731158619\n8988242643\n3830589324\n2229505813\n5633845374\n6473530293\n7053106601\n0834282956\n4607924137\n3 4\n9505\n3845\n3530\n";
		String expected = "YES\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

	@Test
	public void when_not_found_grid_in_larger_grid_should_print_no() throws Exception {
		String systemInput = "1\n15 15\n400453592126560\n114213133098692\n474386082879648\n522356951189169\n887109450487496\n252802633388782\n502771484966748\n075975207693780\n511799789562806\n404007454272504\n549043809916080\n962410809534811\n445893523733475\n768705303214174\n650629270887160\n2 2\n99\n99\n";
		String expected = "NO\n";

		System.setIn(new ByteArrayInputStream(systemInput.getBytes()));
		Solution.main(null);

		assertEquals(expected, outContent.toString());
	}

}
