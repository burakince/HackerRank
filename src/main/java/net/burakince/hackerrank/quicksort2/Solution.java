package net.burakince.hackerrank.quicksort2;

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

		quickSort(numbers);
	}

	private static int[] quickSort(int[] numbers) {
		if (numbers.length < 2) {
			return numbers;
		} else if (numbers.length == 2) {
			if (numbers[0] > numbers[1]) {
				int temp = numbers[0];
				numbers[0] = numbers[1];
				numbers[1] = temp;
			}
			printArray(numbers);
			return numbers;
		}

		int pivot = numbers[0];
		int[] left = new int[0];
		int[] right = new int[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < pivot) {
				left = add(left, numbers[i]);
			} else {
				right = add(right, numbers[i]);
			}
		}
		left = quickSort(left);
		right = quickSort(right);

		int[] result = new int[numbers.length];
		System.arraycopy(left, 0, result, 0, left.length);
		result[left.length] = pivot;
		System.arraycopy(right, 0, result, left.length + 1, right.length);
		printArray(result);
		return result;
	}

	private static int[] add(int[] array, int number) {
		int[] newArray = new int[array.length + 1];
		if (array.length == 0) {
			newArray[0] = number;
			return newArray;
		}
		System.arraycopy(array, 0, newArray, 0, array.length);
		newArray[newArray.length - 1] = number;
		return newArray;
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
