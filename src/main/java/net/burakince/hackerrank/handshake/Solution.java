package net.burakince.hackerrank.handshake;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (0 < tests--) {
			final int boardMember = sc.nextInt();
			final int handshakes = boardMember > 1 ? (boardMember * (boardMember - 1)) / 2 : 0;
			System.out.println(handshakes);
		}
		sc.close();
	}

}
