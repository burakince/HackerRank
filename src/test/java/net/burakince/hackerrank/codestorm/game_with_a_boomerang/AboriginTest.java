package net.burakince.hackerrank.codestorm.game_with_a_boomerang;

import static org.junit.Assert.*;

import org.junit.Test;

public class AboriginTest {

	@Test
	public void when_remove_should_regenerate_array() throws Exception {
		Aborigin aborigin = new Aborigin(5);
		aborigin.remove(3);

		int[] expected = new int[] { 1, 2, 3, 5 };

		assertEqualsArray(expected, aborigin.getValues());
	}

	@Test
	public void when_throw_once_should_regenerate_array() throws Exception {
		Aborigin aborigin = new Aborigin(10);

		aborigin.throwBoomerang();

		int[] expected = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		assertEqualsArray(expected, aborigin.getValues());
	}

	@Test
	public void when_throw_twice_should_regenerate_array() throws Exception {
		Aborigin aborigin = new Aborigin(10);

		aborigin.throwBoomerang();
		aborigin.throwBoomerang();

		int[] expected = new int[] { 1, 3, 4, 5, 7, 8, 9, 10 };

		assertEqualsArray(expected, aborigin.getValues());
	}

	@Test
	public void when_throw_third_times_should_regenerate_array() throws Exception {
		Aborigin aborigin = new Aborigin(10);

		aborigin.throwBoomerang();
		aborigin.throwBoomerang();
		aborigin.throwBoomerang();

		int[] expected = new int[] { 1, 3, 4, 5, 7, 9, 10 };

		assertEqualsArray(expected, aborigin.getValues());
	}

	@Test
	public void when_throw_seven_times_should_regenerate_array() throws Exception {
		Aborigin aborigin = new Aborigin(10);

		aborigin.throwBoomerang();
		aborigin.throwBoomerang();
		aborigin.throwBoomerang();
		aborigin.throwBoomerang();
		aborigin.throwBoomerang();
		aborigin.throwBoomerang();
		aborigin.throwBoomerang();

		int[] expected = new int[] { 1, 5, 9 };

		assertEqualsArray(expected, aborigin.getValues());
	}

	private void assertEqualsArray(int[] expecteds, int[] values) {
		for (int i = 0; i < expecteds.length; i++) {
			assertEquals(expecteds[i], values[i]);
		}
	}

}
