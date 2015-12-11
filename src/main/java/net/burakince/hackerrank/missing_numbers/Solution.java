package net.burakince.hackerrank.missing_numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int[] n = loadArray(sc);
		final int[] m = loadArray(sc);
		sc.close();

		Arrays.sort(n);
		Arrays.sort(m);

		final StringBuilder result = new StringBuilder();
		for (int i = 0, j = 0; i < n.length && j < m.length;) {
			if (n[i] == m[j]) {
				i++;
				j++;
			} else if (n[i] > m[j]) {
				if (result.length() > 0) {
					result.append(' ');
				}
				result.append(m[j++]);
			} else {
				if (result.length() > 0) {
					result.append(' ');
				}
				result.append(n[i++]);
			}
		}
		System.out.println(result.toString());
	}

	private static int[] loadArray(final Scanner sc) {
		final int length = Integer.parseInt(sc.nextLine());
		final int[] array = new int[length];
		String[] line = sc.nextLine().split(" ");
		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(line[i]);
		}
		return array;
	}

}
