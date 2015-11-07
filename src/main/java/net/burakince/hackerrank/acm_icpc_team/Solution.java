package net.burakince.hackerrank.acm_icpc_team;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int peopleCount = sc.nextInt();
		final int topicCount = sc.nextInt();
		final BitSet[] topics = new BitSet[peopleCount];

		for (int i = 0; i < peopleCount; i++) {
			topics[i] = BitSet.valueOf(sc.nextBigInteger(2).toByteArray());
		}
		sc.close();

		int maxBitCount = 0;
		int maxScoreCount = 0;

		for (int i = 0; i < peopleCount - 1; i++) {
			for (int j = i + 1; j < peopleCount; j++) {
				BitSet second = (BitSet) topics[j].clone();
				second.or(topics[i]);
				int bitCount = second.cardinality();
				if (bitCount > maxBitCount) {
					maxBitCount = bitCount;
					maxScoreCount = 1;
				} else if (bitCount == maxBitCount) {
					maxScoreCount++;
				}
			}
		}

		System.out.println(maxBitCount);
		System.out.println(maxScoreCount);
	}

}
