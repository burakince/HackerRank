package net.burakince.hackerrank.pairs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int size = sc.nextInt();
		final int difference = sc.nextInt();
		final List<Integer> numbers = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			numbers.add(sc.nextInt());
		}
		sc.close();

		Collections.sort(numbers);
		int pairs = 0;
		for (Integer n : numbers) {
			if (numbers.contains(n + difference)) {
				pairs++;
			}
		}
		System.out.println(pairs);
	}

}
