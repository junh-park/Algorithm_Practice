package jun.alrorithm.twosum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.either;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {
	private TwoSum sum;
	
	@Before
	public void setUp() {
		sum = new TwoSum();
	}

	@Test
	public void addTest1() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] indices = sum.twoSum(nums, target);
		
		assertThat(indices, either(is(new int[] {0,1})).or(is(new int[] {1,0})));
	}
	
	@Test
	public void addTest2() {
		int[] nums = {3,2,4};
		int target = 6;
		
		int[] indices = sum.twoSum(nums, target);
		
		assertThat(indices, either(is(new int[] {1,2})).or(is(new int[] {2,1})));
	}
}
