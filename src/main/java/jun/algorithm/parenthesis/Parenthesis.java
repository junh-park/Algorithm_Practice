package jun.algorithm.parenthesis;

import java.util.Stack;

public class Parenthesis {
	public static boolean isValid(String s) {
		if (s == null || s.length() % 2 == 1)
			return false;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(')');
			} else if (s.charAt(i) == '{') {
				stack.push('}');
			} else if (s.charAt(i) == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != s.charAt(i) ) {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}
}
