package net.burakince.hackerrank.tech_weekend_online_coding.sachi_and_her_angles;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		StringBuffer result = new StringBuffer();
		Scanner in = new Scanner(System.in);

		for (int test = in.nextInt(); test > 0; --test) {
			double totalAngel = 0;
			boolean isValid = false;
			int angelCount = in.nextInt();

			for (int i = 0; i < angelCount; i++)
				totalAngel += in.nextDouble();

			if (totalAngel == (180 * (angelCount - 2)))
				isValid = true;

			result.append(isValid ? "YES" : "NO");
			result.append("\n");
		}

		System.out.print(result);
	}

}
