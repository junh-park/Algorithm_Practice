package jun.algorithm.medium.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class SubstringFinder {

	public static int longestSubstringLength(String s) {
		if (s.length() == 0) return 0;
		Set acceptedChar = new HashSet();
		int i = 0, j = 0, max = 0;
		while ( j < s.length()) {
			if (!acceptedChar.contains(s.charAt(j))) {
				acceptedChar.add(s.charAt(j++));
				max = Math.max(acceptedChar.size(), max);
			} else {
				acceptedChar.remove(s.charAt(i++));
			}
		}
		return max;
	}

}
