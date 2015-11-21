package net.burakince.hackerrank.find_median;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		System.out.println(array[length / 2]);
	}

}
