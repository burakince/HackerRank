package net.burakince.hackerrank.the_time_in_words;

import java.util.Scanner;

public class Solution {

	private final static String[] TIME_WORDS = { "zero", "one", "two", "three",
			"four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen", "twenty", "twenty one",
			"twenty two", "twenty three", "twenty four", "twenty five",
			"twenty six", "twenty seven", "twenty eight", "twenty nine" };

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int hour = sc.nextInt();
		final int minute = sc.nextInt();
		sc.close();

		String minuteExtension;
		if (minute == 1 || minute == 59) {
			minuteExtension = "minute";
		} else {
			minuteExtension = "minutes";
		}

		String hourWord;
		if (hour == 12) {
			hourWord = TIME_WORDS[1];
		} else {
			hourWord = TIME_WORDS[hour + 1];
		}

		if (minute == 0) {
			System.out.println(TIME_WORDS[hour] + " o' clock");
		} else if (minute == 15) {
			System.out.println("quarter past " + TIME_WORDS[hour]);
		} else if (minute == 30) {
			System.out.println("half past " + TIME_WORDS[hour]);
		} else if (minute == 45) {
			System.out.println("quarter to " + hourWord);
		} else if (minute < 30) {
			System.out.println(TIME_WORDS[minute] + " " + minuteExtension + " past " + TIME_WORDS[hour]);
		} else {
			System.out.println(TIME_WORDS[60 - minute] + " " + minuteExtension + " to " + hourWord);
		}
	}

}
