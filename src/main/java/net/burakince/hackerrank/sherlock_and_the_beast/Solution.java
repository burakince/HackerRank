package net.burakince.hackerrank.sherlock_and_the_beast;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			int number = sc.nextInt();
			int remaining = mod5(number);
			if (remaining < 0) {
				System.out.println(-1);
				continue;
			}
			number -= remaining;
			final StringBuilder result = new StringBuilder();
			while (remaining > 0) {
				result.append("555");
				remaining -= 3;
			}
			while (number > 0) {
				result.append("33333");
				number -= 5;
			}
			System.out.println(result.toString());
		}
		sc.close();
	}

	private static int mod5(int number) {
		while (number > 0) {
			if (number % 3 == 0) {
				return number;
			} else {
				number -= 5;
			}
		}
		return number;
	}

}
