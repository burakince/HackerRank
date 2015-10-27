package net.burakince.hackerrank.insertionsort2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int size = sc.nextInt();
		final int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i < size; i++) {
			int temp = numbers[i];
			int j;
			for (j = i - 1; j >= 0 && temp < numbers[j]; j--) {
				numbers[j + 1] = numbers[j];
				numbers[j] = temp;
			}
			printArray(numbers);
		}
	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
	}

}
