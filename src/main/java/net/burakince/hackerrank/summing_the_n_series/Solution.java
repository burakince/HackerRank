package net.burakince.hackerrank.summing_the_n_series;

import java.util.Scanner;

public class Solution {

	private static final char LINE_END = '\n';
	private static final int MOD = 1000000007;

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		final StringBuilder result = new StringBuilder();
		while (0 < tests--) {
			long number = sc.nextLong() % MOD;
			long pow = (number * number) % MOD;
			result.append(pow).append(LINE_END);
		}
		sc.close();
		System.out.print(result.toString());
	}

}
