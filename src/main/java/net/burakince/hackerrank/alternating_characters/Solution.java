package net.burakince.hackerrank.alternating_characters;

import java.util.Scanner;

public class Solution {

	private static final char NULL_CHAR = '\u0000';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < tests; i++) {
			final String input = sc.nextLine();
			final char[] chars = input.toCharArray();
			char lastChar = NULL_CHAR;
			int deleteCount = 0;
			for (char c : chars) {
				if (lastChar == NULL_CHAR) {
					lastChar = c;
					continue;
				}
				if (c == lastChar) {
					deleteCount++;
				} else {
					lastChar = c;
				}
			}
			System.out.println(deleteCount);
		}
		sc.close();
	}

}
