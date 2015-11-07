package net.burakince.hackerrank.encryption;

import java.util.Scanner;

public class Solution {

	private static final char SPACE = ' ';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final char[] line = sc.nextLine().replaceAll(" ", "").toCharArray();
		sc.close();

		final int rowLength = (int) Math.floor(Math.sqrt(line.length));
		final int columnLength = line.length > rowLength * rowLength ? rowLength + 1 : rowLength;

		final char[] newLine = new char[line.length + columnLength - 1];

		for (int i = 0, k = 0; i < columnLength; i++) {
			for (int j = i; j < line.length; j += columnLength) {
				newLine[k++] = line[j];
			}
			if (i < columnLength - 1) {
				newLine[k++] = SPACE;
			}
		}
		System.out.println(newLine);
	}

}
