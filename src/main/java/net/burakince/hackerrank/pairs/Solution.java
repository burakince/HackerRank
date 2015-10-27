package net.burakince.hackerrank.pairs;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int size = sc.nextInt();
		final int difference = sc.nextInt();
		final int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(numbers);
		int pairs = 0;
		for (int n : numbers) {
			if (Arrays.binarySearch(numbers, n + difference) >= 0) {
				pairs++;
			}
		}
		System.out.println(pairs);
	}

}
