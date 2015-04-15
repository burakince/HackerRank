package net.burakince.hackerrank.sorting_tutorial_intro;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		int arrayLength = in.nextInt();
		int index = 0;

		for (; index < arrayLength; index++)
			if (value == in.nextInt())
				break;

		System.out.print(index + "\n");
	}

}
