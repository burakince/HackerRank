package net.burakince.hackerrank.cavity_map;

import java.util.Scanner;

public class Solution {

	private static final char X = 'X';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = Integer.parseInt(sc.nextLine());
		final char[][] map = new char[n][n];
		for (int x = 0; x < n; x++) {
			map[x] = sc.nextLine().toCharArray();
		}
		sc.close();

		int x = 0;
		System.out.println(map[x++]);
		for (; x < n-1; x++) {
			for (int y = 1; y < n-1; y++) {
				if ((map[x][y] > map[x - 1][y])
						&& (map[x][y] > map[x + 1][y])
						&& (map[x][y] > map[x][y - 1])
						&& (map[x][y] > map[x][y + 1])) {

					map[x][y] = X;
				}
			}
			System.out.println(map[x]);
		}
		System.out.println(map[x]);
	}

}
