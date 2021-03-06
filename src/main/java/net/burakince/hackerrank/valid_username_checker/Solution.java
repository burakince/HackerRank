package net.burakince.hackerrank.valid_username_checker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String username = in.nextLine();
			String pattern = "^(?=.{8,30}$)(?![0-9])[a-zA-Z0-9_]*$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(username);

			if (m.find()) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}

}
