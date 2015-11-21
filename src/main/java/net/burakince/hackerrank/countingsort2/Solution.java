package net.burakince.hackerrank.countingsort2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		final int[] counts = new int[100];
		while (0 < length--) {
			int number = sc.nextInt();
			counts[number]++;
		}
		sc.close();

		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < counts[i]; j++) {
				if (result.length() > 0) {
					result.append(' ');
				}
				result.append(i);
			}
		}
		System.out.println(result.toString());
	}

}
