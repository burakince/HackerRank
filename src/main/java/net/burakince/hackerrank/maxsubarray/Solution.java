package net.burakince.hackerrank.maxsubarray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		Scanner in = new Scanner(System.in);
		byte cases = in.nextByte();

		for (byte c = 0; c < cases; c++) {
			int len = in.nextInt();
			short[] arr = new short[len];

			arr[0] = in.nextShort();
			int currMax = arr[0];
			int bestMax = arr[0];

			boolean hasPossitive = arr[0] > 0;
			int notContinuesMax = 0;
			int maxNegatieNum = Integer.MIN_VALUE;

			if (hasPossitive) {
				notContinuesMax = arr[0];
			} else {
				maxNegatieNum = arr[0];
			}

			for (int i = 1; i < len; i++) {
				arr[i] = in.nextShort();
				currMax = max(arr[i], currMax + arr[i]);
				bestMax = max(bestMax, currMax);

				if (arr[i] > 0) {
					hasPossitive = true;
					notContinuesMax += arr[i];
				} else if (!hasPossitive && arr[i] > maxNegatieNum) {
					maxNegatieNum = arr[i];
				}
			}
			
			result.append(bestMax);
			result.append(' ');
			result.append(hasPossitive ? notContinuesMax : maxNegatieNum);
			result.append('\n');
		}

		System.out.print(result.toString());
	}

	private static int max(int x, int y) {
		return (y > x) ? y : x;
	}

}
