package net.burakince.hackerrank.perfect_hiring;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int candidates = in.nextInt();
		long patience = in.nextLong();
		byte losePatience = in.nextByte();
		long decide = 0;
		int decideId = 0;

		for (int n = 0; n < candidates; n++) {
			int score = in.nextInt();
			long newDecide = score * patience;
			if (newDecide > decide) {
				decide = newDecide;
				decideId = n + 1;
			}
			patience -= losePatience;
		}

		System.out.print(decideId);
	}

}
