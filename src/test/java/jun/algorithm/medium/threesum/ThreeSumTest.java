package jun.algorithm.medium.threesum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.mockito.Matchers.anyList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import jun.algorithm.medium.threesum.ThreeSum;

public class ThreeSumTest {
	ThreeSum sum;
	
	@Before
	public void setUp() {
		sum = new ThreeSum();
	}
	
	@Test
	public void when_0_is_entered_returns_empty() {
		int[] nums = {0};
		assertThat(sum.findSum(nums).isEmpty(), is(true));
	}	
	
	@Test
	public void when_empty_is_entered_returns_empty() {
		int[] nums = {};
		assertThat(sum.findSum(nums).isEmpty(), is(true));
	}
	
	@Test
	public void when_000_is_entered_returns_000() {
		int[] nums = {0,0,0};
		
		Integer[][] array = convertToArray(sum.findSum(nums));
		assertThat(array, is(new Integer[][]{{0,0,0}}));
		assertThat(Arrays.deepToString(array), is("[[0, 0, 0]]"));
	}
	
	@Test
	public void when_411012_is_entered_returns_000() {
		int[] nums = {-4,-1,-1,0,1,2};
		
		Integer[][] array = convertToArray(sum.findSum(nums));
		assertThat(Arrays.deepToString(array), is("[[-1, -1, 2], [-1, 0, 1]]"));
	}

	private Integer[][] convertToArray(List<List<Integer>> nums) {
		Integer[][] result = new Integer[nums.size()][];
		for (int i = 0; i < nums.size(); i++) {
			List<Integer> row = nums.get(i);
			result[i] = row.toArray(new Integer[row.size()]);
		}
		return result;
	}
}
