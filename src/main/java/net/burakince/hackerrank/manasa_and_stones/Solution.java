package net.burakince.hackerrank.manasa_and_stones;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			int stoneCount = sc.nextInt() - 1;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			int current = min * stoneCount;
			int maximum = max * stoneCount;
			int difference = max - min;
			if (max == min) {
				System.out.println(current);
			} else {
				StringBuilder result = new StringBuilder();
				while (current <= maximum) {
					if (result.length() > 0) {
						result.append(' ');
					}
					result.append(current);
					current += difference;
				}
				System.out.println(result.toString());
			}
		}
		sc.close();
	}

}
