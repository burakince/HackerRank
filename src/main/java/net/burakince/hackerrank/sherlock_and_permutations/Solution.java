package net.burakince.hackerrank.sherlock_and_permutations;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final int mod = 1000000007;
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(permutations(n, m, mod));
		}
		sc.close();
	}

	public static long factorial(long number, int mod) {
		long factorial = 1;
		for (long i = 1; i <= number; i++) {
			factorial = (factorial * i) % mod;
		}
		return factorial % mod;
	}

	public static long permutations(long n, long m, int mod) {
		long top = factorial(m + n - 1, mod);
		long bottom = (factorial(m - 1, mod) * factorial(n, mod)) % mod;
		bottom = mmi(bottom, mod);
		return (top * bottom) % mod;
	}

	public static long mmi(long number, int mod) {
		return higherPower(number, mod - 2, mod);
	}

	public static long higherPower(long number, long pow, int mod) {
		if (pow == 0) {
			return 1;
		} else if (pow == 1) {
			return number;
		}

		long half = higherPower(number, pow / 2, mod) % mod;
		if (pow % 2 == 0) {
			return (half * half) % mod;
		} else {
			return (((half * half) % mod) * number) % mod;
		}
	}

}
