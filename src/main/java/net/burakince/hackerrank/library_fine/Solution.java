package net.burakince.hackerrank.library_fine;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final int returnDay = sc.nextInt();
		final int returnMonth = sc.nextInt();
		final int returnYear = sc.nextInt();

		final int expectedDay = sc.nextInt();
		final int expectedMonth = sc.nextInt();
		final int expectedYear = sc.nextInt();

		sc.close();

		if (isReturnTime(expectedDay, expectedMonth, expectedYear, returnDay, returnMonth, returnYear)) {
			System.out.println(0);
		} else if (isNotSameCalanderYear(expectedYear, returnYear)) {
			System.out.println(10000);
		} else if (isNotSameCalanderMonth(expectedMonth, returnMonth)) {
			System.out.println((returnMonth - expectedMonth) * 500);
		} else {
			System.out.println((returnDay - expectedDay) * 15);
		}
	}

	private static boolean isNotSameCalanderMonth(int expectedMonth, int returnMonth) {
		return returnMonth > expectedMonth;
	}

	private static boolean isNotSameCalanderYear(int expectedYear, int returnYear) {
		return returnYear > expectedYear;
	}

	private static boolean isReturnTime(int expectedDay, int expectedMonth, int expectedYear, int returnDay, int returnMonth, int returnYear) {
		return returnYear < expectedYear
				|| (returnYear == expectedYear && returnMonth < expectedMonth)
				|| (returnYear == expectedYear && returnMonth == expectedMonth && returnDay <= expectedDay);
	}

}
