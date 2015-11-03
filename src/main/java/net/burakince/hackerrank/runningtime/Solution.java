package net.burakince.hackerrank.runningtime;

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

		int shifts = 0;
		for (int i = 1; i < size; i++) {
			int temp = numbers[i];
			int j;
			for (j = i - 1; j >= 0 && temp < numbers[j]; j--) {
				numbers[j + 1] = numbers[j];
				numbers[j] = temp;
				shifts++;
			}
		}
		System.out.println(shifts);
	}

}
