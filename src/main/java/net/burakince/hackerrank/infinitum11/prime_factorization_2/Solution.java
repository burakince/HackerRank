package net.burakince.hackerrank.infinitum11.prime_factorization_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result = 0;
		List<Integer> results = null;
		List<Integer> primes = new LinkedList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);

		int testCount = in.nextInt();
		int lastPrime = 5;
		
		for (int test = 0; test < testCount; test++) {
			long number = in.nextInt();
			results = new ArrayList<Integer>();

			while (number != 1) {
				boolean primeFound = false;
				
				for (int prime : primes) {
					if (number % prime == 0) {
						number /= prime;
						results.add(prime);
						primeFound = true;
						break;
					}
				}
				
				if (primeFound)
					continue;

				for (int newPrime = lastPrime + 1; newPrime <= number; newPrime++) {
					boolean primeMultiplesFound = false;
					
					for (int prime : primes) {
						if (newPrime % prime == 0) {
							primeMultiplesFound = true;
							break;
						}
					}
					
					if (primeMultiplesFound) {
						continue;
					} else {
						primes.add(newPrime);
						lastPrime = newPrime;

						if (number % newPrime == 0) {
							number /= newPrime;
							results.add(newPrime);
							break;
						}
					}
				}
			}

			for (int prime : results)
				result += prime;
		}

		System.out.print(result + "\n");
	}

}
