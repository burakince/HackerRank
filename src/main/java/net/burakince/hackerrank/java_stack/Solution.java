package net.burakince.hackerrank.java_stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	private static final char ROUND_BRACKET_CLOSE = ')';
	private static final char ROUND_BRACKET_OPEN = '(';
	private static final char CURLY_BRACKET_CLOSE = '}';
	private static final char CURLY_BRACKET_OPEN = '{';
	private static final char BRACKET_CLOSE = ']';
	private static final char BRACKET_OPEN = '[';

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			final String input = sc.nextLine();
			final char[] characters = input.toCharArray();
			final Stack<Character> stack = new Stack<Character>();
			for (char c : characters) {
				if (c == BRACKET_OPEN
						|| c == CURLY_BRACKET_OPEN
						|| c == ROUND_BRACKET_OPEN) {

					stack.push(c);
					continue;
				}

				if (!stack.empty()) {
					if (isOpenedBefore(stack, c, BRACKET_OPEN, BRACKET_CLOSE)
							|| isOpenedBefore(stack, c, CURLY_BRACKET_OPEN, CURLY_BRACKET_CLOSE)
							|| isOpenedBefore(stack, c, ROUND_BRACKET_OPEN, ROUND_BRACKET_CLOSE)) {

						stack.pop();
					}
				} else {
					stack.push(c);
				}
			}
			System.out.println(stack.empty() ? "true" : "false");
		}
		sc.close();
	}

	private static boolean isOpenedBefore(final Stack<Character> stack, char c, char openChar, char closeChar) {
		return c == closeChar && stack.peek() == openChar;
	}

}
