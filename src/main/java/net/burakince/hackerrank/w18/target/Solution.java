package net.burakince.hackerrank.w18.target;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int circleSize = sc.nextInt();
		final int shotsSize = sc.nextInt();
		final long[] circles = new long[circleSize];
		for (int i = 0; i < circleSize; i++) {
			circles[i] = sc.nextLong();
		}
		long total = 0;
		for (int i = 0; i < shotsSize; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			double hypotenuse = pythagoras(x, y);
			for (int j = circleSize - 1; j >= 0; j--) {
				if (hypotenuse <= circles[j]) {
					total += j + 1;
					break;
				}
			}
		}
		sc.close();
		System.out.println(total);
	}

	private static double pythagoras(long x, long y) {
		if (x == 0 && y == 0) {
			return 0;
		}
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

}
