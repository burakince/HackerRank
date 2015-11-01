package net.burakince.hackerrank.game_of_thrones;

import java.util.Scanner;

public class Solution {

	private static final String YES = "YES";
	private static final String NO = "NO";
	private static final char A = 'a';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final char[] key = sc.nextLine().toCharArray();
		sc.close();

		final int[] letterCounts = new int[26];
		for (char k : key) {
			final int keyIndex = k - A;
			letterCounts[keyIndex]++;
		}

		int oddCount = 0;
		for (int i=0; i<26; i++) {
			if (letterCounts[i] == 0) {
				continue;
			}

			if (letterCounts[i] % 2 == 1) {
				oddCount++;
			}
		}

		if (key.length % 2 == 1 && oddCount == 1) {
			System.out.println(YES);
		} else if (key.length % 2 == 0 && oddCount == 0) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
	}

}
