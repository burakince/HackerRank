package net.burakince.hackerrank.w18.ghosts;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String[] line = sc.nextLine().split(" ");
		sc.close();

		final int towns = Integer.parseInt(line[0]);
		final int streets = Integer.parseInt(line[1]);
		final int houses = Integer.parseInt(line[2]);
		final int aparts = Integer.parseInt(line[3]);

		int ghosts = 0;
		for (int t = 1; t <= towns; t++) {
			for (int s = 1; s <= streets; s++) {
				for (int h = 1; h <= houses; h++) {
					for (int a = 1; a <= aparts; a++) {
						if (isGhostLives(t, s, h, a)) {
							ghosts++;
						}
					}
				}
			}
		}
		System.out.println(ghosts);
	}

	public static boolean isGhostLives(int towns, int streets, int houses, int aparts) {
		return Math.abs(towns - streets) % 3 == 0
				&& (streets + houses) % 5 == 0
				&& (towns % 4 == 0 || houses % 4 == 0)
				&& BigInteger.valueOf(towns).gcd(BigInteger.valueOf(aparts)).intValue() == 1;
//				&& GCD(towns, aparts) == 1;
	}

	@SuppressWarnings("unused")
	private static int GCD(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		return GCD(b, a % b);
	}

}
