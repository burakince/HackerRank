package net.burakince.hackerrank.countingsort4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private static final char SPACE = ' ';

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		final int[] counts = new int[100];
		@SuppressWarnings("rawtypes")
		final List[] lists = new List[100];
		for (int i = 0; i < length; i++) {
			final String[] line = sc.nextLine().split(" ");
			final int number = Integer.parseInt(line[0]);
			if (counts[number] == 0) {
				lists[number] = new LinkedList<String>();
			}
			counts[number]++;
			lists[number].add(isDashable(i, length) ? "-" : line[1]);
		}
		sc.close();

		final StringBuilder result = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			if (counts[i] == 0) {
				continue;
			}
			LinkedList<String> currentList = (LinkedList<String>) lists[i];
			for (String s : currentList) {
				if (result.length() > 0) {
					result.append(SPACE);
				}
				result.append(s);
			}
		}
		System.out.println(result.toString());
	}

	private static boolean isDashable(int i, int length) {
		return i < length / 2;
	}

}
