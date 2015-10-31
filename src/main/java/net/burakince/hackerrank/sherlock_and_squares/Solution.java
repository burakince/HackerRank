package net.burakince.hackerrank.sherlock_and_squares;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final double aSqrt = Math.sqrt(a);
			final double bSqrt = Math.sqrt(b);
			System.out.println(getIntegerCountBetween(aSqrt, bSqrt));
		}
		sc.close();
	}

	private static int getIntegerCountBetween(double aSqrt, double bSqrt) {
		return (int) Math.floor(bSqrt - Math.ceil(aSqrt)) + 1;
	}

}
