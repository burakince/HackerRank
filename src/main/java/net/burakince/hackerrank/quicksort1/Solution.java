package net.burakince.hackerrank.quicksort1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int lenght = sc.nextInt();
		final int[] numbers = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(numbers);
		printArray(numbers);
	}

	private static void printArray(int[] numbers) {
		String result = "";
		for (int n : numbers) {
			if (!result.isEmpty()) {
				result += " ";
			}
			result += n;
		}
		System.out.println(result);
	}

}
