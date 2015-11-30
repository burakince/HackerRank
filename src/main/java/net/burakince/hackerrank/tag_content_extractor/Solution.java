package net.burakince.hackerrank.tag_content_extractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	private static Pattern pattern = Pattern.compile("<(\\w+\\s*\\w+)>(.+)<(\\/\\1)>");

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.nextLine());
		while (0 < tests--) {
			String line = sc.nextLine();
			Matcher matcher = pattern.matcher(line);
			if (matcher.find()) {
				String found = matcher.group(2);
				if (found.startsWith("<")) {
					Matcher newMatcher = pattern.matcher(found);
					if (newMatcher.find()) {
						System.out.println(newMatcher.group(2));
					}
				} else if (found.contains("</")) {
					System.out.println("None");
				} else {
					System.out.println(matcher.group(2));
				}
			} else {
				System.out.println("None");
			}
		}
		sc.close();
	}

}
