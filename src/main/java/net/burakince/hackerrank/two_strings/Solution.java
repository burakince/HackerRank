package net.burakince.hackerrank.two_strings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			String firstLine = sc.nextLine();
			String secondLine = sc.nextLine();

			String result = "NO";
			for (int i = 0, j = 'a'; i < 26; i++, j++) {
				String letter = "" + (char) j;
				if (firstLine.contains(letter) && secondLine.contains(letter)) {
					result = "YES";
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

}
