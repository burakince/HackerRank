package net.burakince.hackerrank.the_love_letter_mystery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (byte t = Byte.parseByte(br.readLine()); t > 0; --t) {

			int numOps = 0;
			char[] str = br.readLine().toCharArray();

			for (short i = 0, j = (short) (str.length - 1); i < j; ++i, --j) {
				numOps += str[i] < str[j] ? str[j] - str[i] : str[i] - str[j];
			}

			sb.append(numOps + "\n");
		}

		System.out.print(sb);
	}

}