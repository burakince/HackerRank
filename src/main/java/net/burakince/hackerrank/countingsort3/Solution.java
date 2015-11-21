package net.burakince.hackerrank.countingsort3;

import java.util.Scanner;

public class Solution {

	private static final char SPACE = ' ';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		final int[] counts = new int[100];
		while (0 < length--) {
			final String[] line = sc.nextLine().split(" ");
			final int number = Integer.parseInt(line[0]);
			counts[number]++;
		}
		sc.close();

		int lastTotalCount = 0;
		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			if (result.length() > 0) {
				result.append(SPACE);
			}
			result.append(lastTotalCount + counts[i]);
			lastTotalCount += counts[i];
		}
		System.out.println(result.toString());
	}

}
