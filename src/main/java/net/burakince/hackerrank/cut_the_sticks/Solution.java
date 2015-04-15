package net.burakince.hackerrank.cut_the_sticks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int sticksCount = in.nextInt();
		int[] sticks = new int[sticksCount];
		StringBuffer stickCounts = new StringBuffer();

		for (int i = 0; i < sticksCount; i++)
			sticks[i] = in.nextInt();

		while (sticks.length > 0) {
			stickCounts.append(sticks.length);
			stickCounts.append("\n");

			int lowestLength = findLowestLength(sticks);

			List<Integer> tempSticks = new ArrayList<Integer>();

			for (int i = 0; i < sticks.length; i++) {
				int newLength = sticks[i] - lowestLength;
				if (newLength > 0)
					tempSticks.add(newLength);
			}

			int i = 0;
			sticks = new int[tempSticks.size()];

			for (Integer tempStick : tempSticks)
				sticks[i++] = tempStick;
		}

		System.out.print(stickCounts);
	}

	private static int findLowestLength(int[] sticks) {
		int lowestLength = sticks[0];

		for (int i = 1; i < sticks.length; i++)
			if (sticks[i] < lowestLength)
				lowestLength = sticks[i];

		return lowestLength;
	}

}
