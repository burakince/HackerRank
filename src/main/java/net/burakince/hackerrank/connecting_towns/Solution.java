package net.burakince.hackerrank.connecting_towns;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			int towns = sc.nextInt();
			long routes = 1;
			while (1 < towns--) {
				routes = (routes * sc.nextInt()) % 1234567;
			}
			System.out.println(routes);
		}
		sc.close();
	}

}
