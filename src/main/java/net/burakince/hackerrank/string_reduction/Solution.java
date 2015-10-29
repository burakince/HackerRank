package net.burakince.hackerrank.string_reduction;

import java.util.Scanner;

public class Solution {

	private static final char A = 'a';
	private static final char B = 'b';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		while (test-- > 0) {
			int a = 0;
			int b = 0;
			int c = 0;
			char[] line = sc.nextLine().toCharArray();
			for (char letter : line) {
				if (letter == A) {
					a++;
				} else if (letter == B) {
					b++;
				} else {
					c++;
				}
			}
			if (isAllLettersSameType(a, b, c, line)) {
				System.out.println(line.length);
			} else if (isAllEvenNumber(a, b, c) || isAllOddNumber(a, b, c)) {
				System.out.println(2);
			} else {
				System.out.println(1);
			}
		}
		sc.close();
	}

	private static boolean isAllOddNumber(int a, int b, int c) {
		return a % 2 == 1
				&& b % 2 == 1
				&& c % 2 == 1;
	}

	private static boolean isAllEvenNumber(int a, int b, int c) {
		return a % 2 == 0
				&& b % 2 == 0
				&& c % 2 == 0;
	}

	private static boolean isAllLettersSameType(int a, int b, int c, char[] line) {
		return line.length == a
				|| line.length == b
				|| line.length == c;
	}

}
