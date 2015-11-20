package net.burakince.hackerrank.java_dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final Deque<Integer> doubleEndedQueue = new ArrayDeque<Integer>();
		int[] numbers = new int[10000001];
		int i = 0;
		int arraySize = sc.nextInt();
		int subArraySize = sc.nextInt();
		int maximumAmount = 0;
		int count = 0;

		for (; i < subArraySize; i++) {
			int number = sc.nextInt();
			if (numbers[number] == 0) {
				count++;
				if (maximumAmount < count) {
					maximumAmount = count;
				}
			}
			numbers[number]++;
			doubleEndedQueue.addLast(number);
		}

		for (; i < arraySize; i++) {
			if (numbers[(int) doubleEndedQueue.getFirst()] == 1) {
				count--;
			}
			numbers[(int) doubleEndedQueue.getFirst()]--;
			doubleEndedQueue.removeFirst();
			int number = sc.nextInt();
			if (numbers[number] == 0) {
				count++;
				if (maximumAmount < count) {
					maximumAmount = count;
				}
			}
			numbers[number]++;
			doubleEndedQueue.addLast(number);
		}

		sc.close();
		System.out.println(maximumAmount);
	}

}
