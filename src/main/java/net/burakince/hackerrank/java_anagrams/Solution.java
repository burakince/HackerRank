package net.burakince.hackerrank.java_anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String s1 = sc.nextLine();
		final String s2 = sc.nextLine();
		System.out.println(isAnagram(s1, s2) ? "Anagrams" : "Not Anagrams");
		sc.close();
	}

	private static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String sc1 = new String(c1);
		String sc2 = new String(c2);
		return sc1.equals(sc2);
	}

}
