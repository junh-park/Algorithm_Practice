package jun.algorithm.medium.longestsubstring;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import jun.algorithm.medium.longestsubstring.SubstringFinder;

public class LongestSubstringTest {

	@Test
	public void findLongestSubstringTest1() {
		String s = "abcabcbb";
		
		assertThat(SubstringFinder.longestSubstringLength(s), is(3)); 
	}
	
	@Test
	public void findLongestSubstringTest2() {
		String s = "bbbbb";
		
		assertThat(SubstringFinder.longestSubstringLength(s), is(1)); 
	}
	
	@Test
	public void findLongestSubstringTest3() {
		String s = "pwwkew";
		
		assertThat(SubstringFinder.longestSubstringLength(s), is(3)); 
	}
	
	@Test
	public void findLongestSubstringTest4() {
		String s = "aab";
		
		assertThat(SubstringFinder.longestSubstringLength(s), is(2)); 
	}
	
	@Test
	public void findLongestSubstringTest5() {
		String s = "au";
		
		assertThat(SubstringFinder.longestSubstringLength(s), is(2)); 
	}
}
