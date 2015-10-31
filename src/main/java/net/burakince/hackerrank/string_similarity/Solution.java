package net.burakince.hackerrank.string_similarity;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			final char[] line = sc.nextLine().toCharArray();
			final int length = line.length;
			final int[] zscore = new int[length];
			for (int i = 1, left = 0, right = 0; i < length; ++i) {
				if (i <= right) {
					zscore[i] = Math.min(right - i + 1, zscore[i - left]);
				}
				while (i + zscore[i] < length && line[zscore[i]] == line[i + zscore[i]]) {
					++zscore[i];
				}
				if (i + zscore[i] - 1 > right) {
					left = i;
					right = i + zscore[i] - 1;
				}
			}
			long total = length;
			for (int i = 0; i < length; i++) {
				total += zscore[i];
			}
			System.out.println(total);
		}
		sc.close();
	}

}
