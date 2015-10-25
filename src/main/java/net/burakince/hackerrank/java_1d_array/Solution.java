package net.burakince.hackerrank.java_1d_array;

import java.util.Scanner;

public class Solution {

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = sc.nextInt();
		for (int t = 0; t < tests; ++t) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			int[] array = new int[n];
			for (int j = 0; j < n; ++j) {
				array[j] = sc.nextInt();
			}
			if (array[0] == 1) {
				System.out.println("NO");
			} else {
				System.out.println(move(array, m, 0, array) ? "YES" : "NO");
			}
		}
		sc.close();
	}

	private static boolean move(int[] array, int jump, int start, int[] arrayBackup) {
		boolean result = false;
		arrayBackup[start] = -1;
		if (start + jump >= array.length || start + 1 >= array.length) {
			return true;
		} else if (array[start + 1] == 1 && array[start + jump] == 1 && start - 1 > 0 && array[start - 1] == 1) {
			array[start] = 1;
			return false;
		} else {
			if (!result && array[start + jump] == 0 && arrayBackup[start + jump] == 0) {
				result = move(array, jump, start + jump, arrayBackup);
			}
			if (!result && array[start + 1] == 0 && arrayBackup[start + 1] == 0) {
				result = move(array, jump, start + 1, arrayBackup);
			}
			if (!result && start - 1 > 0 && array[start - 1] == 0 && arrayBackup[start - 1] == 0) {
				result = move(array, jump, start - 1, arrayBackup);
			}
		}
		return result;
	}

}
