package net.burakince.hackerrank.maximizing_xor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int left = in.nextInt();
		int right = in.nextInt();
		int maxNum = 0;

		for (; left <= right; left++) {
			for (int y = left; y <= right; y++) {
				int tempNum = left ^ y;
				if (tempNum > maxNum)
					maxNum = tempNum;
			}
		}

		System.out.print(maxNum);
	}

}