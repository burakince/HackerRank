package net.burakince.hackerrank.priyanka_and_toys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			weights[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(weights);
		int toyWeight = -5;
		int toys = 0;
		for (int i = 0; i < n; i++) {
			if (weights[i] > toyWeight + 4) {
				toys++;
				toyWeight = weights[i];
			}
		}
		System.out.println(toys);
	}

}
