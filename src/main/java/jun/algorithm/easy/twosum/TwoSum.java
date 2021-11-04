package jun.algorithm.easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map diffDic = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (diffDic.containsKey(diff)) {
				return new int[] { i, (int) diffDic.get(diff) };
			}
			diffDic.put(nums[i], i);
		}
		return null;
	}
}
