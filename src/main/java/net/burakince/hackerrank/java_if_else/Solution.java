package net.burakince.hackerrank.java_if_else;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		sc.close();

		if (isOdd(n)) {
			System.out.println("Weird");
		} else if (isEven(n) && isBetween(n, 2, 5)) {
			System.out.println("Not Weird");
		} else if (isEven(n) && isBetween(n, 6, 20)) {
			System.out.println("Weird");
		} else if (isEven(n) && n > 20) {
			System.out.println("Not Weird");
		}
	}

	private static boolean isBetween(int n, int start, int end) {
		return start <= n && n <= end;
	}

	private static boolean isEven(final int n) {
		return n % 2 == 0;
	}

	private static boolean isOdd(final int n) {
		return n % 2 == 1;
	}

}
