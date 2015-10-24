package net.burakince.hackerrank.java_2d_array;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final int array[][] = new int[6][6];

		final Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int top = array[i][j] + array[i][j + 1] + array[i][j + 2];
				int center = array[i + 1][j + 1];
				int bottom = array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];

				sum = top + center + bottom;

				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

}
