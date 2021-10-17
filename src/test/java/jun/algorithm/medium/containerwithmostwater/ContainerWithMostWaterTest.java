package jun.algorithm.medium.containerwithmostwater;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ContainerWithMostWaterTest {

	@Test
	public void findTheBiggestContainerTest1() {
		int[] height = { 1, 1 };

		assertThat(WaterContainer.findTheBiggestContainer(height), is(1));
	}

	@Test
	public void findTheBiggestContainerTest2() {
		int[] height = { 1, 2, 1 };

		assertThat(WaterContainer.findTheBiggestContainer(height), is(2));
	}

	@Test
	public void findTheBiggestContainerTest3() {
		int[] height = { 3,2,1 };

		assertThat(WaterContainer.findTheBiggestContainer(height), is(2));
	}
	
	@Test
	public void findTheBiggestContainerTest4() {
		int[] height = { 4,3,2,1,4 };

		assertThat(WaterContainer.findTheBiggestContainer(height), is(16));
	}
	
	@Test
	public void findTheBiggestContainerTest5() {
		int[] height = { 1,8,6,2,5,4,8,3,7 };

		assertThat(WaterContainer.findTheBiggestContainer(height), is(49));
	}
	
	@Test
	public void findTheBiggestContainerTest6() {
		int[] height = { 4,1,8,6,2,5,4,8,3,7,25,12,11};

		assertThat(WaterContainer.findTheBiggestContainer(height), is(80));
	}
	
	@Test
	public void findTheBiggestContainerTest7() {
		int[] height = { 2,8,4,8,5};

		assertThat(WaterContainer.findTheBiggestContainer(height), is(16));
	}
}
