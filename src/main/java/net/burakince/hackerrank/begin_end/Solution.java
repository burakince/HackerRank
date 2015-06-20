package net.burakince.hackerrank.begin_end;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();

		int result = length;
		for (int subStringLen = 2; subStringLen <= length; subStringLen++) {
			int maxIndex = length - subStringLen;
			int subStrLen = subStringLen - 1;
			for (int startIndex = 0; startIndex <= maxIndex; startIndex++) {
				if (str[startIndex] == str[startIndex + subStrLen]) {
					result++;
				}
			}
		}

		System.out.print(result);
	}

}
