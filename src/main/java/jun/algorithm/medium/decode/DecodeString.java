package jun.algorithm.medium.decode;

import java.util.Stack;

public class DecodeString {
	public String decodeString(String s) {
		Stack<Object> counts = new Stack<>();
		Stack<Object> result = new Stack<>();
		String res = "";
		int index = 0;
		
		while (index < s.length()) {
			if (Character.isDigit(s.charAt(index))) {
				int count = 0;
				while(Character.isDigit(s.charAt(index))) {
					count = 10 * count + (s.charAt(index) - '0');
					index +=1;
				}
			} else if ( s.charAt(index)== '[') {
				result.push(res);
				res = "";
				index += 1;
			} else if (s.charAt(index) == ']') {
				res += s.charAt(index);
				index += 1;
			}
		}
		return res;
	}
}
