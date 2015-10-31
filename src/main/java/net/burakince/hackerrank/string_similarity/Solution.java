package net.burakince.hackerrank.string_similarity;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			final char[] line = sc.nextLine().toCharArray();
			final int length = line.length;
			int total = length;
			for (int i = 1; i < length; i++) {
				int j = 0;
				for (; j < length - i; j++) {
					if (line[j] != line[j + i]) {
						break;
					}
				}
				total += j;
			}
			System.out.println(total);
		}
		sc.close();
	}

}
