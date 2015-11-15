package net.burakince.hackerrank.bigger_is_greater;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			String s = sc.nextLine();
			char[] line = s.toCharArray();
			int length = line.length;

			int i;
			for (i = length - 2; i >= 0; i--) {
				int j;
				for (j = length - 1; j > i; j--) {
					if (line[j] > line[i]) {
						break;
					}
				}

				if (j == i) {
					continue;
				}

				char temp = line[j];
				line[j] = line[i];
				line[i] = temp;
				s = new String(line);
				s = s.substring(0, i + 1) + sort(s.substring(i + 1));
				break;
			}

			System.out.println(i < 0 ? "no answer" : s);
		}
		sc.close();
	}

	private static String sort(String s) {
		char[] c = s.toCharArray();
		return sort(c);
	}

	private static String sort(char[] line) {
		for (int i = 1; i < line.length; i++) {
			int pivot = line[i];
			int j = i;
			while (j > 0 && line[j - 1] > pivot) {
				line[j] = line[j - 1];
				j--;
			}
			line[j] = (char) pivot;

		}
		return new String(line);
	}

}
