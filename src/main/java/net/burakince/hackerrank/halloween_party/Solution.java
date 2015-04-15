package net.burakince.hackerrank.halloween_party;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		StringBuffer decision = new StringBuffer();
		Scanner in = new Scanner(System.in);

		int testCount = in.nextInt();

		for (int i = 0; i < testCount; i++) {
			long chocolate = in.nextInt();
			double result = 0;
			long halfChocolate = chocolate / 2;

			if (chocolate % 2 == 0)
				result = Math.pow(halfChocolate, 2);
			else
				result = halfChocolate * (halfChocolate + 1);

			decision.append((long) result);
			decision.append("\n");
		}

		System.out.print(decision);
	}

}
