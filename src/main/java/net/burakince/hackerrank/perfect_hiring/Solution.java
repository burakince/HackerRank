package net.burakince.hackerrank.perfect_hiring;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		short candidates = in.nextShort();
		int patience = in.nextInt();
		byte losePatience = in.nextByte();
		long decide = 0;
		short decideId = 0;

		for (short n = 0; n < candidates; n++) {
			int score = in.nextInt();
			long newDecide = score * patience;
			if (newDecide > decide) {
				decide = newDecide;
				decideId = (short) (n + 1);
			}
			patience -= losePatience;
		}

		System.out.print(decideId);
	}

}
