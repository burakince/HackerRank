package net.burakince.hackerrank.sherlock_and_valid_string;

import java.util.Scanner;

public class Solution {

	private static final char A = 'a';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().toCharArray();
		sc.close();

		int[] counts = new int[26];
		for (char c : chars) {
			int charIndex = c - A;
			counts[charIndex]++;
		}

		int totalCount = 0;
		int charCount = 0;
		int maxCount = 0;
		for (int i=0; i<26; i++) {
			if (counts[i] == 0) {
				continue;
			}
			charCount++;
			totalCount += counts[i];
			if (maxCount < counts[i]) {
				maxCount = counts[i];
			}
		}
		System.out.println(maxCount * charCount == totalCount || maxCount * (charCount - 1) == totalCount - 1 || (maxCount - 1) * charCount == totalCount - 1 ? "YES" : "NO");
	}

}
