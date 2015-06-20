package net.burakince.hackerrank.begin_end;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;

		for (int subStringLen = 1; subStringLen <= length; subStringLen++) {
			int maxIndex = length - subStringLen;
			for (int startIndex = 0; startIndex <= maxIndex; startIndex++) {
				int endIndex = startIndex + subStringLen;
				String subString;
				if (endIndex > length) {
					subString = str.substring(startIndex);
				} else {
					subString = str.substring(startIndex, endIndex);
				}
				if (isTrue(subString, subStringLen)) {
					result++;
				}
			}
		}

		System.out.print(result);
	}

	private static boolean isTrue(String subString, int len) {
		if (len == 1) {
			return true;
		}
		return subString.charAt(0) == subString.charAt(subString.length() - 1);
	}

}
