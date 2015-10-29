package net.burakince.hackerrank.codestorm.emmas_notebook;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final long second = sc.nextInt();
		sc.close();
		long oneCount = 0;
		for (long i = 1; i <= second; i++) {
			oneCount += calculate(i);
		}
		System.out.println(oneCount);
	}

	private static long calculate(long second) {
		if (second == 1) {
			return 1;
		}
		return (second / 2) + 1;
	}

}
