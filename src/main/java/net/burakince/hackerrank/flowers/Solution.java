package net.burakince.hackerrank.flowers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int flowersCount = sc.nextInt();
		final int people = sc.nextInt();
		final int[] flowers = new int[flowersCount];
		for (int i = 0; i < flowersCount; i++) {
			flowers[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(flowers);
		int turns = flowersCount / people;
		int remain = flowersCount % people;
		int total = 0;
		int i;
		for (i = 1; i <= turns; i++) {
			for (int j = 1; j <= people; j++) {
				total += flowers[--flowersCount] * i;
			}
		}
		for (int j = 0; j < remain; j++) {
			total += flowers[--flowersCount] * i;
		}
		System.out.println(total);
	}

}
