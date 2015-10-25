package net.burakince.hackerrank.java_bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int tests = sc.nextInt();
		final String s[] = new String[tests + 2];
		for (int i = 0; i < tests; i++) {
			s[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < tests; i++) {
			int index = i;
			for (int j = i + 1; j < tests; j++) {
				BigDecimal bi2 = new BigDecimal(s[j]);
				BigDecimal bi3 = new BigDecimal(s[index]);
				if (bi2.compareTo(bi3) > 0) {
					index = j;
				}
			}
			String smallerNumber = s[index];
			s[index] = s[i];
			s[i] = smallerNumber;
		}

		for (int i = 0; i < tests; i++) {
			System.out.println(s[i]);
		}
	}

}
