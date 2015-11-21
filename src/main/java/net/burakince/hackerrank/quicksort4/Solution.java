package net.burakince.hackerrank.quicksort4;

import java.util.Scanner;

class SortSwapCount {
	
	private int count = 0;

	public void countUp() {
		count++;
	}

	public int getCount() {
		return count;
	}

}

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int length = sc.nextInt();
		final int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();

		SortSwapCount quickSortSwapCount = new SortSwapCount();
		SortSwapCount insertionSortSwapCount = new SortSwapCount();

		quickSort(numbers, quickSortSwapCount);
		insertionSort(numbers, insertionSortSwapCount);

		System.out.println(insertionSortSwapCount.getCount() - quickSortSwapCount.getCount());
	}

	private static void insertionSort(int[] numbers, SortSwapCount sortSwapCount) {
		for (int i = 1; i < numbers.length; i++) {
			int temp = numbers[i];
			int j;
			for (j = i - 1; j >= 0 && temp < numbers[j]; j--) {
				sortSwapCount.countUp();
				numbers[j + 1] = numbers[j];
				numbers[j] = temp;
			}
		}
	}

	private static int[] quickSort(int[] numbers, SortSwapCount sortSwapCount) {
		if (numbers.length < 2) {
			return numbers;
		} else if (numbers.length == 2) {
			if (numbers[0] > numbers[1]) {
				sortSwapCount.countUp();
				int temp = numbers[0];
				numbers[0] = numbers[1];
				numbers[1] = temp;
			}
			return numbers;
		}

		int pivot = numbers[numbers.length - 1];
		int[] left = new int[0];
		int[] right = new int[0];
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] < pivot) {
				sortSwapCount.countUp();
				left = add(left, numbers[i]);
			} else {
				right = add(right, numbers[i]);
			}
		}
		left = quickSort(left, sortSwapCount);
		right = quickSort(right, sortSwapCount);

		int[] result = new int[numbers.length];
		System.arraycopy(left, 0, result, 0, left.length);
		sortSwapCount.countUp();
		result[left.length] = pivot;
		System.arraycopy(right, 0, result, left.length + 1, right.length);
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

}
