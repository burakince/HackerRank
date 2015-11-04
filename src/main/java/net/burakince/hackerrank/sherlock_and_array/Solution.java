package net.burakince.hackerrank.sherlock_and_array;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int size = sc.nextInt();
			if (size == 1) {
				sc.nextInt();
				System.out.println("YES");
				continue;
			}
			int[] numbers = new int[size];
			for (int i = 0; i < size; i++) {
				numbers[i] = sc.nextInt();
			}
			String result = "NO";
			int sumLeft = 0;
			int sumRight = getSumOfElementsRight(numbers, 1, size);
			for (int i = 1; i < size - 1; i++) {
				sumLeft += numbers[i - 1];
				sumRight -= numbers[i];
				if (sumLeft == sumRight) {
					result = "YES";
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

	private static int getSumOfElementsRight(int[] numbers, int index, int size) {
		int sum = 0;
		for (int i = index; i < size; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
