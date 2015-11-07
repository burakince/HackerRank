package net.burakince.hackerrank.extra_long_factorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int number = sc.nextInt();
		sc.close();

		System.out.println(factorial(number).toString());
	}

	private static BigInteger factorial(int number) {
		if (number == 1) {
			return BigInteger.ONE;
		}
		return BigInteger.valueOf(number).multiply(factorial(number - 1));
	}

}
