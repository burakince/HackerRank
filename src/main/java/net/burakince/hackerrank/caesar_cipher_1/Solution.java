package net.burakince.hackerrank.caesar_cipher_1;

import java.util.Scanner;

public class Solution {

	private static final char LOWERCASE_A = 'a';
	private static final char UPPERCASE_A = 'A';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		final char[] string = sc.nextLine().toCharArray();
		final int k = Integer.parseInt(sc.nextLine());
		sc.close();

		for (int i=0; i<length; i++) {
			if (Character.isLetter(string[i])) {
				char a = Character.isUpperCase(string[i]) ? UPPERCASE_A : LOWERCASE_A;
				string[i] = (char) (a + (string[i] - a + k) % 26);
			}
		}
		System.out.println(string);
	}

}
