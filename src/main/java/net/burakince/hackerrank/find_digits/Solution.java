package net.burakince.hackerrank.find_digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuffer result = new StringBuffer();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int zeroCharCode = 48;

		for (int test = Integer.parseInt(in.readLine()); test > 0; --test) {
			int count = 0;
			String rawNumber = in.readLine().trim();
			int length = rawNumber.length();
			int number = Integer.parseInt(rawNumber);

			for (int i = 0; i < length; i++) {
				int digit = rawNumber.charAt(i) - zeroCharCode;
				count += (digit != 0 && (number % digit) == 0) ? 1 : 0;
			}

			result.append(count);
			result.append("\n");
		}

		System.out.print(result);
	}

}
