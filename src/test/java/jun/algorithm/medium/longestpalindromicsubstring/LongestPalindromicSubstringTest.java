package jun.algorithm.medium.longestpalindromicsubstring;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.either;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class LongestPalindromicSubstringTest {
	
	@Test
	public void when_a_is_entered_returns_a() {
		LongestPalindromicSubstring pan = new LongestPalindromicSubstring();
		String s = "a";
		
		assertThat(pan.findSubstring(s), either(is("bab")).or(is("aba"));
	}
}
