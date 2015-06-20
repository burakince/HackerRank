package net.burakince.hackerrank.dance_in_pairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count = in.nextInt();
		long difference = in.nextLong();
		int result = 0;

		List<Long> boysHeights = new ArrayList<Long>(count);
		List<Long> girlsHeights = new ArrayList<Long>(count);

		for (int i = 0; i < count; i++) {
			boysHeights.add(in.nextLong());
		}
		for (int i = 0; i < count; i++) {
			girlsHeights.add(in.nextLong() - difference);
		}

		Collections.sort(boysHeights);
		Collections.sort(girlsHeights);

		for (int i = 0; i < count; i++) {
			if (((long)boysHeights.get(i)) >= ((long)girlsHeights.get(i))) {
				result++;
			} else {
				break;
			}
		}

		System.out.print(result);
	}

}
