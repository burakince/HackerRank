package net.burakince.hackerrank.lonely_integer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> integerList = new ArrayList<Integer>();
		List<Integer> lonelyIntegers = new ArrayList<Integer>();

		int testCases = in.nextInt();

		for (int i = 0; i < testCases; i++) {
			Integer testCase = in.nextInt();

			if (integerList.contains(testCase)) {
				if (lonelyIntegers.contains(testCase))
					lonelyIntegers.remove(testCase);
			} else {
				lonelyIntegers.add(testCase);
				integerList.add(testCase);
			}
		}

		System.out.print(lonelyIntegers.get(0) + "\n");
	}

}
