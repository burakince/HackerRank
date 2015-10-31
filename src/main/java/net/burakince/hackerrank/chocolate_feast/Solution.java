package net.burakince.hackerrank.chocolate_feast;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (0 < test--) {
			final int money = sc.nextInt();
			final int chocolatePrice = sc.nextInt();
			final int offer = sc.nextInt();
			int boughtCount = money / chocolatePrice;
			boughtCount += buyChocolateWithWrappers(boughtCount, offer);
			System.out.println(boughtCount);
		}
		sc.close();
	}

	private static int buyChocolateWithWrappers(int wrappers, int offer) {
		if (wrappers < offer) {
			return 0;
		}
		final int chocolate = wrappers / offer;
		final int unusedWrappers = wrappers - chocolate * offer;
		return chocolate + buyChocolateWithWrappers(chocolate + unusedWrappers, offer);
	}

}
