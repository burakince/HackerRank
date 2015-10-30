package net.burakince.hackerrank.mark_and_toys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int toyCount = sc.nextInt();
		final long money = sc.nextLong();
		final long[] toys = new long[toyCount];
		for (int i = 0; i < toyCount; i++) {
			toys[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(toys);
		long takedToys = 0;
		long totalPrice = 0;
		for (int i = 0; i < toyCount; i++) {
			totalPrice += toys[i];
			if (totalPrice < money) {
				takedToys++;
			} else {
				break;
			}
		}
		System.out.println(takedToys);
	}

}
