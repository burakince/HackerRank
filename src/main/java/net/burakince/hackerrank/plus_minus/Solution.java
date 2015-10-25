package net.burakince.hackerrank.plus_minus;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int total = sc.nextInt();
		double positive = 0;
		double negative = 0;
		double zeros = 0;
		for (int i=0; i< total; i++) {
			int value = sc.nextInt();
			if (value > 0) {
				positive++;
			} else if (value < 0) {
				negative++;
			} else {
				zeros++;
			}
		}
		System.out.printf("%.3f\n%.3f\n%.3f\n", positive / total, negative / total, zeros / total);
		sc.close();
	}

}
