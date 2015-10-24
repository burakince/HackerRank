package net.burakince.hackerrank.java_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		final List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int t = 0; t < n; t++) {
			final int d = sc.nextInt();
			final List<Integer> innerList = new ArrayList<Integer>();
			for (int i = 0; i < d; i++) {
				innerList.add(sc.nextInt());
			}
			list.add(innerList);
		}

		final int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			final int x = sc.nextInt();
			final int y = sc.nextInt();
			if (x <= n && y <= list.get(x - 1).size()) {
				System.out.println(list.get(x - 1).get(y - 1));
			} else {
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}

}
