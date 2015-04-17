package net.burakince.hackerrank.infinitum11.confused_gorilla;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer result = new StringBuffer();
		int testCount = in.nextInt();

		for (int test = 0; test < testCount; test++) {
			int number = in.nextInt();

			if (number == 0) {
				result.append("0 0\n");
				continue;
			}

			int half = (number % 2 == 0 ? number / 2 : (number / 2) + 1);

			for (int x = 0, y = number; x < half; x++, y--) {
				result.append(x);
				result.append(" ");
				result.append(y);
				result.append("\n");

				result.append(y);
				result.append(" ");
				result.append(x);
				result.append("\n");
			}

			if (number % 2 == 0) {
				result.append(half);
				result.append(" ");
				result.append(half);
				result.append("\n");
			}
		}

		System.out.print(result);
	}

}
