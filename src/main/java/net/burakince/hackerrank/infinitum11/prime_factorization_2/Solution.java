package net.burakince.hackerrank.infinitum11.prime_factorization_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = 0;
		List<Integer> primes = null;

		int testCount = in.nextInt();

		for (int test = 0; test < testCount; test++) {
			int number = in.nextInt();
			primes = new ArrayList<Integer>();

			for (int prime = 2; number != 1; prime++) {
				if (number % prime == 0) {
					number /= prime;
					primes.add(prime);
					prime--;
				}
			}

			for (int prime : primes)
				result += prime;
		}

		System.out.print(result + "\n");
	}

}
