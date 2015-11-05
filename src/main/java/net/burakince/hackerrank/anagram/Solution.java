package net.burakince.hackerrank.anagram;

import java.util.Scanner;

public class Solution {

	private static final char A = 'a';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			final char[] line = sc.nextLine().toCharArray();
			if (isOdd(line.length)) {
				System.out.println(-1);
			} else {
				int half = line.length / 2;
				int[] s1 = new int[26];
				int[] s2 = new int[26];

				for (int i = 0, j = half; j < line.length; i++, j++) {
					int s1Index = line[i] - A;
					int s2Index = line[j] - A;
					s1[s1Index]++;
					s2[s2Index]++;
				}

				int count = 0;
				for (int i=0; i< 26; i++) {
					int need = s2[i] - s1[i];
					count += need > 0 ? need : 0;
				}
				System.out.println(count);
			}
		}
		sc.close();
	}

	private static boolean isOdd(int length) {
		return length % 2 == 1;
	}

}
