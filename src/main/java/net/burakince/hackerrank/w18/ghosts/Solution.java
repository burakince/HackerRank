package net.burakince.hackerrank.w18.ghosts;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int towns = sc.nextInt();
		final int streets = sc.nextInt();
		final int houses = sc.nextInt();
		final int aparts = sc.nextInt();
		sc.close();


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
				&& (towns * houses) % 4 == 0
				&& GCD(towns, aparts) == 1;
	}

	private static int GCD(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		}
		return GCD(b, a % b);
	}

}
