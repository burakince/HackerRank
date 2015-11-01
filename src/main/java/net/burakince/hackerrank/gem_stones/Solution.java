package net.burakince.hackerrank.gem_stones;

import java.util.Scanner;

public class Solution {

	private static final char A = 'a';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = Integer.parseInt(sc.nextLine());
		int[][] elementCounts = new int[tests][26];
		for (int i = 0; i < tests; i++) {
			char[] elements = sc.nextLine().toCharArray();
			for (char element : elements) {
				int elementIndex = element - A;
				if (elementCounts[i][elementIndex] == 0) {
					elementCounts[i][elementIndex] = 1;
				}
			}
		}
		sc.close();

		int totalCount = 0;
		for (int i = 0; i < 26; i++) {
			boolean gemstone = true;
			for (int j = 0; j < tests; j++) {
				if (elementCounts[j][i] == 0) {
					gemstone = false;
					break;
				}
			}
			if (gemstone) {
				totalCount++;
			}
		}
		System.out.println(totalCount);
	}

}
