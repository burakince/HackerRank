package net.burakince.hackerrank.two_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			final int[] a = new int[n];
			final int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			Arrays.sort(b);
			String result = "YES";
			for (int i = 0, j = n - 1; i < n; i++, j--) {
				if ((a[i] + b[j]) < k) {
					result = "NO";
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

}
