package net.burakince.hackerrank.find_point;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int px = sc.nextInt();
			final int py = sc.nextInt();
			final int qx = sc.nextInt();
			final int qy = sc.nextInt();
			final int x = 2 * qx - px;
			final int y = 2 * qy - py;
			System.out.println(x + " " + y);
		}
		sc.close();
	}

}
