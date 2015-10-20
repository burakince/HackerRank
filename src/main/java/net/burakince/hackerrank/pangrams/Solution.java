package net.burakince.hackerrank.pangrams;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final char[] alphabet = "abcdefghijklmnopqrstuvwxyz ".toCharArray();
		final String s = in.nextLine().toLowerCase();
		boolean pangram = true;
		for (char c : alphabet) {
			if (s.indexOf(c) < 0) {
				pangram = false;
				break;
			}
		}
		in.close();
		System.out.println(pangram ? "pangram" : "not pangram");
	}

}
