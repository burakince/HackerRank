package net.burakince.hackerrank.reverse_game;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			int length = sc.nextInt();
			int searchKey = sc.nextInt();
			int searchIndex = searchKey + 1;
			int i;
			for (i = 0; i < length - 1; i++) {
				int range = length - i;
				searchIndex = range - searchIndex + 1;
				searchIndex -= 1;
			}
			System.out.println(searchIndex + i - 1);
		}
		sc.close();
	}

}
