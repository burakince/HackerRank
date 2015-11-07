package net.burakince.hackerrank.the_grid_search;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			final String[] largerGridSize = sc.nextLine().split(" ");
			final int largerGridHeight = Integer.parseInt(largerGridSize[0]);
			final int largerGridWidth = Integer.parseInt(largerGridSize[1]);

			final char[][] largerGrid = new char[largerGridHeight][largerGridWidth];
			for (int i = 0; i < largerGridHeight; i++) {
				largerGrid[i] = sc.nextLine().toCharArray();
			}

			final String[] smallerGridSize = sc.nextLine().split(" ");
			final int smallerGridHeight = Integer.parseInt(smallerGridSize[0]);
			final int smallerGridWidth = Integer.parseInt(smallerGridSize[1]);

			final char[][] smallerGrid = new char[smallerGridHeight][smallerGridWidth];
			for (int i = 0; i < smallerGridHeight; i++) {
				smallerGrid[i] = sc.nextLine().toCharArray();
			}

			boolean found = false;
			for (int height = 0; height <= largerGridHeight - smallerGridHeight; height++) {
				for (int width = 0; width <= largerGridWidth - smallerGridWidth; width++) {
					if (largerGrid[height][width] == smallerGrid[0][0]) {
						if (isEqual(largerGrid, height, width, smallerGrid, smallerGridHeight, smallerGridWidth)) {
							found = true;
							break;
						}
					}
				}
				if (found) {
					break;
				}
			}
			System.out.println(found ? "YES" : "NO");
		}
		sc.close();
	}

	private static boolean isEqual(char[][] largerGrid, int largerHeight, int largerWidth, char[][] smallerGrid, int smallerHeight, int smallerWidth) {
		for (int largerGridHeight = largerHeight, smallerGridHeight = 0; smallerGridHeight < smallerHeight; largerGridHeight++, smallerGridHeight++) {
			for (int largerGridWidth = largerWidth, smallerGridWidth = 0; smallerGridWidth < smallerWidth; largerGridWidth++, smallerGridWidth++) {
				if (largerGrid[largerGridHeight][largerGridWidth] != smallerGrid[smallerGridHeight][smallerGridWidth]) {
					return false;
				}
			}
		}
		return true;
	}

}
