package net.burakince.hackerrank.jim_and_the_orders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int test = sc.nextInt();
		final int[][] timeAndOrders = new int[test][2];
		for (int i = 0, j = 1; i < test; i++, j++) {
			timeAndOrders[i][0] = sc.nextInt() + sc.nextInt();
			timeAndOrders[i][1] = j;
		}
		sc.close();

		Arrays.sort(timeAndOrders, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] > o2[0]) {
					return 1;
				} else if (o1[0] < o2[0]) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		String result = "";
		for (int i = 0; i < test; i++) {
			if (!result.isEmpty()) {
				result += " ";
			}
			result += timeAndOrders[i][1];
		}
		System.out.println(result);
	}

}
