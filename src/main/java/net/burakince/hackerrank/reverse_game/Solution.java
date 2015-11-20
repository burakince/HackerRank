package net.burakince.hackerrank.reverse_game;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			int length = sc.nextInt();
			int key = sc.nextInt();
			System.out.println(key < length / 2 ? key * 2 + 1 : length * 2 - key * 2 - 2);
		}
		sc.close();
	}

}
