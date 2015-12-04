package net.burakince.hackerrank.sherlock_and_moving_tiles;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		double a = Math.sqrt(2);
		double diagonal = a * length;
		double s3 = Math.abs(s1 - s2);
		int tests = sc.nextInt();
		while (0 < tests--) {
			double distance = sc.nextDouble();
			double diagonal2 = a * Math.sqrt(distance);
			if (s3 != 0) {
				System.out.println((Math.abs(diagonal - diagonal2)) / s3);
			} else {
				System.out.println(0.00000000000000);
			}
		}
		sc.close();
	}

}
