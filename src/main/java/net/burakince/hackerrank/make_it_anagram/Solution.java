package net.burakince.hackerrank.make_it_anagram;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final char[] line1 = sc.nextLine().toCharArray();
		final char[] line2 = sc.nextLine().toCharArray();
		sc.close();

		final int[] line1Counts = new int[26];
		final int[] line2Counts = new int[26];

		calculateCounts(line1, line1Counts);
		calculateCounts(line2, line2Counts);

		int totalCount = 0;
		for (int i = 0; i < 26; i++) {
			totalCount += Math.abs(line1Counts[i] - line2Counts[i]);
		}

		System.out.println(totalCount);
	}

	private static void calculateCounts(final char[] line, final int[] lineCounts) {
		for (char c : line) {
			final int index = c - 97;
			lineCounts[index]++;
		}
	}

}
