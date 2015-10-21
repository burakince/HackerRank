package net.burakince.hackerrank.java_loops;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int test = 0; test < tests; test++) {
			String result = "";
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int before = 0;
			for (int j = 0; j < n; j++) {
				before += Math.pow(2, j) * b;
				int r = a + before;
				result += r + " ";
			}
			System.out.println(result.trim());
		}
		sc.close();
	}

}
