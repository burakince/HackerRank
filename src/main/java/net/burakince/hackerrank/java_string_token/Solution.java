package net.burakince.hackerrank.java_string_token;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = clearUnwantedChars(s);
		s = replaceSpace(s);
		if (s.isEmpty()) {
			System.out.println(0);
		} else {
			String[] tokens = s.split(" ");
			System.out.println(tokens.length);
			for (String t : tokens) {
				System.out.println(t);
			}
		}
		sc.close();
	}
	

	protected static String clearUnwantedChars(String input) {
		return input
				.replaceAll("!", " ")
				.replaceAll(",", " ")
				.replaceAll("\\?", " ")
				.replaceAll("\\.", " ")
				.replaceAll("_", " ")
				.replaceAll("'", " ")
				.replaceAll("@", " ");
	}

	protected static String replaceSpace(String input) {
		return input.replaceAll("\\s+", " ").trim();
	}

}
