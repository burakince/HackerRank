package net.burakince.hackerrank.insertionsort1;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		StringBuffer result = new StringBuffer();
		Scanner in = new Scanner(System.in);
		int arrayLength = in.nextInt();
		int[] values = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++)
			values[i] = in.nextInt();

		int insertValue = values[arrayLength - 1];
		boolean ready = false;

		for (int i = arrayLength - 2; i >= 0; i--) {
			if (insertValue < values[i])
				values[i + 1] = values[i];
			else {
				values[i + 1] = insertValue;
				ready = true;
			}

			printValues(result, values);

			if (ready)
				break;
		}

		if (!ready) {
			values[0] = insertValue;

			printValues(result, values);
		}

		System.out.print(result);
	}

	private static void printValues(StringBuffer result, int[] values) {
		for (int value : values) {
			result.append(value);
			result.append(" ");
		}

		result.append("\n");
	}

}
