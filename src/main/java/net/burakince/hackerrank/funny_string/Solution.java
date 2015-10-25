package net.burakince.hackerrank.funny_string;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int tests = Integer.parseInt(in.nextLine());
		for (int test = 0; test < tests; test++) {
			String result = "Funny";
			String s = in.nextLine();
			char[] chars = s.toCharArray();
			int length = chars.length;
			int midPoimt = length / 2;
			for (int i = 0, j = length - 1; i < midPoimt; i++, j--) {
				if (!isFunny(chars, i, j)) {
					result = "Not Funny";
					break;
				}
			}
			System.out.println(result);
		}
		in.close();
	}

	private static boolean isFunny(char[] chars, int i, int j) {
		int left = ((int) chars[i + 1] - (int) chars[i]);
		int right = ((int) chars[j] - (int)chars[j - 1]);
		return left == right || left == right * -1;
	}

}
