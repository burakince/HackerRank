package net.burakince.hackerrank.java_1d_array;

import java.util.Scanner;

public class Solution {

	public static boolean move(int[] array, int position, int m) {
		if (array.length <= position + m) {
			return true;
		}
		array[position] = 1;
		boolean hasEscaped = false;
		if (position + m < array.length && 0 == array[position + m]) {
			hasEscaped = move(array, position + m, m);
		}
		if (!hasEscaped && position + 1 < array.length && 0 == array[position + 1]) {
			hasEscaped = move(array, position + 1, m);
		}
		if (!hasEscaped && 0 <= position - 1 && 0 == array[position - 1]) {
			hasEscaped = move(array, position - 1, m);
		}
		return hasEscaped;
	}

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = sc.nextInt();
		for (int t = 0; t < tests; ++t) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			int[] array = new int[n];
			for (int j = 0; j < n; ++j) {
				array[j] = sc.nextInt();
			}
			if (array[0] == 1) {
				System.out.println("NO");
			} else {
				System.out.println(move(array, 0, m) ? "YES" : "NO");
			}
		}
		sc.close();
	}
}
