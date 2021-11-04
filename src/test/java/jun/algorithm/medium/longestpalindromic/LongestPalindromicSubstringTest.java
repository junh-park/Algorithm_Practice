package jun.algorithm.medium.longestpalindromic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

	private panSubstring sub;

	@Before
	public void setUp() {
		sub = new panSubstring();
	}
	
	@Test
	public void when_a_is_entered_returns_a() {
		String s = "a";
		
		assertThat(sub.findSubstring(s), is("a"));
	}
}
