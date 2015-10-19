package net.burakince.hackerrank.diagonal_difference;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int r = 0;
		if (n == 1) {
			r = Integer.parseInt(in.nextLine());
		} else {
			int[][] m = new int[n][n];
			for (int i = 0; i < n; i++) {
				String[] m1 = in.nextLine().split(" ");
				for (int j = 0; j < n; j++) {
					m[i][j] = Integer.parseInt(m1[j]);
				}
			}

			int s1 = 0, s2 = 0;
			for (int x = 0, y1 = 0, y2 = n - 1; x < n; x++, y1++, y2--) {
				s1 += m[y1][x];
				s2 += m[y2][x];
			}
			r = s1 - s2;
		}
		System.out.println(r < 0 ? r * -1 : r);
		in.close();
	}

}
