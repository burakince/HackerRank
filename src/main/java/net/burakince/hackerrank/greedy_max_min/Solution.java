package net.burakince.hackerrank.greedy_max_min;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int length = sc.nextInt();
		final int k = sc.nextInt() - 1;
		final int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(numbers);

		int difference = Integer.MAX_VALUE;
		int max = 0;
		int min = 0;
		for (int i = 0; i < length - k; i++) {
			int newDiff = numbers[i + k] - numbers[i];
			if (difference > newDiff) {
				difference = newDiff;
				max = numbers[i + k];
				min = numbers[i];
			}
		}
		System.out.println(max - min);
	}

}
