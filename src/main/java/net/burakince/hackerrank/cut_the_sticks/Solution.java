package net.burakince.hackerrank.cut_the_sticks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int sticksCount = in.nextInt();
		List<Stick> sticks = new ArrayList<Stick>();
		StringBuffer stickCounts = new StringBuffer();

		for (int i = 0; i < sticksCount; i++)
			sticks.add(new Stick(in.nextInt()));

		while (!sticks.isEmpty()) {
			stickCounts.append(sticks.size());
			stickCounts.append("\n");

			int lowestLength = findLowestLength(sticks);

			for (Stick stick : sticks)
				stick.cut(lowestLength);

			Iterator<Stick> stickIterator = sticks.iterator();
			while (stickIterator.hasNext()) {
				Stick stick = stickIterator.next();
				if (stick.isNotLeft())
					stickIterator.remove();
			}
		}

		System.out.print(stickCounts);
	}

	private static int findLowestLength(List<Stick> sticks) {
		int lowestLength = Integer.MAX_VALUE;

		for (Stick stick : sticks)
			if (stick.length() < lowestLength)
				lowestLength = stick.length();

		return lowestLength;
	}

}

class Stick {

	private int length;

	public Stick(int length) {
		this.length = length;
	}
	
	public boolean isNotLeft() {
		return length < 1;
	}

	public void cut(int length) {
		this.length -= length;
	}

	public int length() {
		return length;
	}

}
