package jun.algorithm.medium.longestpalindromic;

public class panSubstring {

	public String findSubstring(String s) {
		if(s.length() < 1 || s == null) return "";
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int num1 = checkFromMiddle(s, i, i);
			int num2 = checkFromMiddle(s, i, i+1);
			int longest = Math.max(num1, num2);
			if (longest > end - start) {
				start = i - ((longest - 1) / 2);
				end = i + (longest / 2) ;
			}
		}
		
		return s.substring(start, end + 1);
	}
	
	private int checkFromMiddle(String s, int left, int right) {
		if (s == null || left > right) return 0;
		
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {
		panSubstring substring = new panSubstring();
		substring.findSubstring("racecar");
	}
}
