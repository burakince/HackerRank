package net.burakince.hackerrank.countingsort1;

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

		String result = "";
		for (int i = 0; i < 100; i++) {
			if (!result.isEmpty()) {
				result += " ";
			}
			result += counts[i];
		}
		System.out.println(result);
	}

}
