package net.burakince.hackerrank.filling_jars;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int tests = sc.nextInt();
		long total = 0;
		while (0 < tests--) {
			final long a = sc.nextLong();
			final long b = sc.nextLong();
			final long k = sc.nextLong();
			total += (Math.abs(a - b) + 1) * k;
		}
		sc.close();
		System.out.println((long) Math.floor(total / n));
	}

}
