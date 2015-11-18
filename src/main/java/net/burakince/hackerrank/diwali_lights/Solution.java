package net.burakince.hackerrank.diwali_lights;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int bulb = sc.nextInt();
			long power = 1;
			for (int i = 0; i < bulb; i++) {
				power *= 2;
				power %= 100000;
			}
			System.out.println(power - 1);
		}
		sc.close();
	}

}
