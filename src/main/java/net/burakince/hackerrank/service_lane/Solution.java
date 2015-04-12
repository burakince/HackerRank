package net.burakince.hackerrank.service_lane;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int serviceLaneLength = in.nextInt();
		int testCases = in.nextInt();

		int[] serviceLane = new int[serviceLaneLength];

		for (int i = 0; i < serviceLaneLength; i++)
			serviceLane[i] = in.nextInt();

		String result = "";

		for (int testCase = 1; testCase <= testCases; testCase++) {
			int input = in.nextInt();
			int output = in.nextInt();
			int serviceWidth = 3;

			for (int i = input; i <= output; i++)
				if (serviceLane[i] < serviceWidth)
					serviceWidth = serviceLane[i];

			result += serviceWidth + "\n";
		}

		System.out.print(result);
	}

}
