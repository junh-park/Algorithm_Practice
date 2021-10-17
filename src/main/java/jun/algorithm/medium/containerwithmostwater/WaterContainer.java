package jun.algorithm.medium.containerwithmostwater;

public class WaterContainer {

	public static int findTheBiggestContainer(int[] height) {
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] > height[right]) { right--; } 
			else { left++; }
		}
		return maxArea;
	}
}
