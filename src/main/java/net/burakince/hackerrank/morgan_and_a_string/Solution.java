package net.burakince.hackerrank.morgan_and_a_string;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			final char[] line1 = sc.nextLine().toCharArray();
			final char[] line2 = sc.nextLine().toCharArray();
			final char[] resultLine = new char[line1.length + line2.length];
			for (int i=0, j=0, k=0; k < resultLine.length; k++) {
				if (i == line1.length) {
					resultLine[k] = line2[j++];
				} else if (j == line2.length) {
					resultLine[k] = line1[i++];
				} else if (line1[i] < line2[j]) {
					resultLine[k] = line1[i++];
				} else if (line2[j] < line1[i]) {
					resultLine[k] = line2[j++];
				} else if (line1[i] == line2[j]) {
					int result = compareTo(line1, i, line2, j);
					if (result < 1) {
						resultLine[k] = line1[i++];
					} else {
						resultLine[k] = line2[j++];
					}
				}
			}
			System.out.println(resultLine);
		}
		sc.close();
	}

	private static int compareTo(char[] line1, int index1, char[] line2, int index2) {
		for (int i = index1, j = index2; i < line1.length && j < line2.length; i++, j++) {
			if (line1[i] < line2[j]) {
				return -1;
			} else if (line1[i] > line2[j]) {
				return 1;
			}
		}
		return 0;
	}

}
