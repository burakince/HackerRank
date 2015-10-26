package net.burakince.hackerrank.taum_and_bday;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = sc.nextInt();
		for (int i = 0; i < tests; i++) {
			final long black = sc.nextLong();
			final long white = sc.nextLong();
			final long blackCost = sc.nextLong();
			final long whiteCost = sc.nextLong();
			final long convertCost = sc.nextLong();
			final long realBlackCost = blackCost <= whiteCost + convertCost ? blackCost : whiteCost + convertCost;
			final long realWhiteCost = whiteCost <= blackCost + convertCost ? whiteCost : blackCost + convertCost;
			final long result = black * realBlackCost + white * realWhiteCost;
			System.out.println(result);
		}
		sc.close();
	}

}
