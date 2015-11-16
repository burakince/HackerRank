package net.burakince.hackerrank.strange_grid;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final long row = sc.nextLong();
		final int column = sc.nextInt();
		sc.close();
		System.out.println(getValue(row, column));
	}

	private static long getValue(long row, int column) {
		return ((2 * column) - (row % 2 == 0 ? 1 : 2)) + (10 * ((row - 1) / 2));
	}

}
