package net.burakince.hackerrank.restaurant;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int length = sc.nextInt();
			final int breadth = sc.nextInt();
			int minimum = Math.min(length, breadth);
			while (0 < minimum) {
				if (length % minimum == 0 && breadth % minimum == 0) {
					System.out.println((length / minimum) * (breadth / minimum));
					break;
				}
				minimum--;
			}
		}
		sc.close();
	}

}
