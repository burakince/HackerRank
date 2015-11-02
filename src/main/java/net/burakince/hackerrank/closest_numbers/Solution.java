package net.burakince.hackerrank.closest_numbers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Pair {

	private long first;
	private long second;

	public Pair(long first, long second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return first + " " + second + " ";
	}

}

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int count = sc.nextInt();
		final long[] integers = new long[count];
		for (int i = 0; i < count; i++) {
			integers[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(integers);
		final List<Pair> pairs = new LinkedList<Pair>();

		long minDiff = Long.MAX_VALUE;
		for (int i = 1; i < count; i++) {
			long diff = integers[i] - integers[i - 1];
			if (diff < minDiff) {
				pairs.clear();
				minDiff = diff;
				pairs.add(new Pair(integers[i - 1], integers[i]));
			} else if (diff == minDiff) {
				pairs.add(new Pair(integers[i - 1], integers[i]));
			}
		}
		for (Pair p : pairs) {
			System.out.print(p.toString());
		}
		System.out.println();
	}

}
