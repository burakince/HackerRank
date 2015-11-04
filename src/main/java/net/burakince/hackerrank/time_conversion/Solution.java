package net.burakince.hackerrank.time_conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws ParseException {
		final Scanner sc = new Scanner(System.in);
		final String time = sc.nextLine();
		sc.close();

		final DateFormat fromFormat = new SimpleDateFormat("hh:mm:ssa");
		final Date date = fromFormat.parse(time);

		final DateFormat toFormat = new SimpleDateFormat("HH:mm:ss");
		final String result = toFormat.format(date);

		System.out.println(result);
	}

}
