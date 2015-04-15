package net.burakince.hackerrank.angry_professor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		StringBuffer decision = new StringBuffer();
		Scanner in = new Scanner(System.in);

		int testCount = in.nextInt();

		for (int test = 0; test < testCount; test++) {
			int studentCount = in.nextInt();
			int minimumOnTime = in.nextInt();

			int realOnTime = 0;

			for (int i = 0; i < studentCount; i++) {
				int studentTime = in.nextInt();
				if (studentTime <= 0)
					realOnTime++;
			}

			decision.append(realOnTime >= minimumOnTime ? "NO" : "YES");
			decision.append("\n");
		}

		System.out.print(decision);
	}

}
