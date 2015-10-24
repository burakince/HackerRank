package net.burakince.hackerrank.java_1d_array_easy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int length = sc.nextInt();
		final int[] array = new int[length];
		for (int t = 0; t < length; t++) {
			array[t] = sc.nextInt();
		}
		int result = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j <= length; j++) {
				int[] subarray = Arrays.copyOfRange(array, i, j);
				int total = 0;
				for (int k = 0; k < subarray.length; k++) {
					total += subarray[k];
				}
				if (total < 0) {
					result++;
				}
			}
		}
		System.out.println(result);
		sc.close();
	}

}
