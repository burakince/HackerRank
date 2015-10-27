package net.burakince.hackerrank.icecream_parlor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = sc.nextInt();
		for (int t = 0; t < tests; t++) {
			final int totalCost = sc.nextInt();
			final int length = sc.nextInt();
			int[] flavors = new int[length];
			for (int i = 0; i < length; i++) {
				flavors[i] = sc.nextInt();
			}
			int price1 = 0;
			int price2 = 0;
			for (int i = 0; i < length; i++) {
				int needPrice = totalCost - flavors[i];
				if (needPrice < 0) {
					continue;
				}
				price1 = i + 1;
				for (int j = i + 1; j < length; j++) {
					if (flavors[j] == needPrice) {
						price2 = j + 1;
						break;
					}
				}
				if (price2 > 0) {
					break;
				}
			}
			System.out.println(price1 + " " + price2);
		}
		sc.close();
	}

}
