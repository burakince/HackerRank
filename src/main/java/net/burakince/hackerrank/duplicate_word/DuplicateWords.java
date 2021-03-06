package net.burakince.hackerrank.duplicate_word;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

	public static void main(String[] args) {
		String pattern = "(\\b\\w+\\b)(\\s*\\1\\b)+";
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

		final Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		while (0 < testCases--) {
			String line = sc.nextLine();
			Matcher m = r.matcher(line);
			while (m.find()) {
				line = line.replaceAll(m.group(), m.group(1));
			}
			System.out.println(line);
		}
		sc.close();
	}

}
