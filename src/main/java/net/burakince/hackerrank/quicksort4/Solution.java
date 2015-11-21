package net.burakince.hackerrank.quicksort4;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		final int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		int insertionShifts = insertionSort(copyArray(numbers));
		int quickSortShifts = quickSort(numbers);

		System.out.println(insertionShifts - quickSortShifts);
	}

	private static int[] copyArray(int[] numbers) {
		final int length = numbers.length;
		int[] newArray = new int[length];
		for (int i = 0; i < length; i++) {
			newArray[i] = numbers[i];
		}
		return newArray;
	}

	private static int insertionSort(int[] numbers) {
		int shifts = 0;
		final int length = numbers.length;
		for (int i = 1; i < length; i++) {
			int j = i;
			int val = numbers[i];
			while (j > 0 && numbers[j - 1] > val) {
				numbers[j] = numbers[j - 1];
				j--;
				shifts++;
			}
			numbers[j] = val;
		}
		return shifts;
	}

	private static int quickSort(int[] numbers) {
		return quickSort(numbers, 0, numbers.length);
	}

	private static int quickSort(int[] numbers, int min, int max) {
		final int length = max - min;
		if (length < 2) {
			return 0;
		}
		int count = partition(numbers, min, max);
		final int mid = min + count - 1;
		count += quickSort(numbers, min, mid);
		count += quickSort(numbers, mid + 1, max);
		return count;
	}

	private static int partition(int[] numbers, int min, int max) {
		final int pivot = numbers[--max];

		int storeMax = min;
		for (int i = min; i < max; i++) {
			if (numbers[i] < pivot) {
				final int temp = numbers[i];
				numbers[i] = numbers[storeMax];
				numbers[storeMax++] = temp;
			}
		}

		numbers[max] = numbers[storeMax];
		numbers[storeMax] = pivot;

		return storeMax + 1 - min;
	}
}
