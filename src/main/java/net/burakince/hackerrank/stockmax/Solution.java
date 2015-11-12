package net.burakince.hackerrank.stockmax;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int shareCount = sc.nextInt();
			final int[] shares = new int[shareCount];
			for (int i = 0; i < shareCount; i++) {
				shares[i] = sc.nextInt();
			}

			long profit = 0;
			int currentMax = Integer.MIN_VALUE;
			for (int i = shareCount - 1; i >= 0; i--) {
				currentMax = Math.max(currentMax, shares[i]);
				profit += (currentMax - shares[i]);
			}
			System.out.println(profit);
		}
		sc.close();
	}

}
