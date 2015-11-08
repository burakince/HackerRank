package net.burakince.hackerrank.palindrome_index;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			final char[] line = sc.nextLine().toCharArray();
			final int half = line.length / 2;
			int i = 0;
			int j = line.length - 1;
			boolean notFound = true;
			for (; i < half; i++, j--) {
				if (line[i] != line[j] && line[i + 1] == line[j]) {
					if (i + 2 < half) {
						if (line[i + 2] == line[j - 1]) {
							System.out.println(i);
							notFound = false;
							break;
						}
					} else {
						System.out.println(i);
						notFound = false;
						break;
					}
				}

				if (line[i] != line[j] && line[i] == line[j - 1]) {
					System.out.println(j);
					notFound = false;
					break;
				}
			}
			if (notFound) {
				System.out.println(-1);
			}
		}
		sc.close();
	}

}
