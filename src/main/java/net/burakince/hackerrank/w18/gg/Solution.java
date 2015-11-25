package net.burakince.hackerrank.w18.gg;

import java.util.Scanner;

public class Solution {

	private static final char G = 'G';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		final int n = Integer.parseInt(line[0]);
		final long mod = Long.parseLong(line[1]);
		final char[] symbols = sc.nextLine().toCharArray();
		sc.close();

		int lastValue = 0;
		long total = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (symbols[i] == G) {
				lastValue++;
			} else if (lastValue > 0) {
				lastValue--;
			}
			total = (total + (lastValue % mod)) % mod;
		}
		System.out.println(total / n);
	}

}
