package net.burakince.hackerrank.missing_numbers;

import java.util.Scanner;

public class Solution {

	private static final char SPACE = ' ';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int[] n = loadArray(sc);
		final int[] m = loadArray(sc);
		sc.close();

		final StringBuilder result = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if (n[i] == m[i]) {
				continue;
			}
			if (result.length() > 0) {
				result.append(SPACE);
			}
			result.append(i);
		}

		System.out.println(result.toString());
	}

	private static int[] loadArray(final Scanner sc) {
		sc.nextLine();
		final int[] counts = new int[10001];
		final String[] line = sc.nextLine().split(" ");
		for (String value : line) {
			int num = Integer.parseInt(value);
			counts[num]++;
		}
		return counts;
	}

}
