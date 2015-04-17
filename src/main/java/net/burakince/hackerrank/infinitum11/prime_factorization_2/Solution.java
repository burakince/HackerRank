package net.burakince.hackerrank.infinitum11.prime_factorization_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = 0;
		List<Integer> results = null;

		int testCount = in.nextInt();
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < testCount; i++)
			numbers.add(in.nextInt());

		int maxNumber = Collections.max(numbers);

		boolean[] primes = new boolean[maxNumber + 1];

		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = false;
				}
			}
		}

		for (Integer number : numbers) {
			results = new ArrayList<Integer>();

			for (int prime = 2; number != 1; prime++) {
				if (primes[prime]) {
					if (number % prime == 0) {
						number /= prime;
						results.add(prime);
						prime--;
					}
				}
			}

			for (int prime : results)
				result += prime;
		}

		System.out.print(result + "\n");
	}

}
