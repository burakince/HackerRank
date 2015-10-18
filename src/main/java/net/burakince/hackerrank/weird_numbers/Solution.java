package net.burakince.hackerrank.weird_numbers;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		if (value % 2 == 1) {
			System.out.println("Weird");
		} else {
			if (value > 1 && value < 6) {
				System.out.println("Not Weird");
			} else if (value > 5 && value < 21) {
				System.out.println("Weird");
			} else if (value > 20) {
				System.out.println("Not Weird");
			}
		}
		in.close();
	}

}
