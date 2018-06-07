import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC480Test {
	LC480 obj = new LC480();
	@Test
	void test0() {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 4;
		double[] expected = {0,1,1,4,5.5};
		double[] actual = obj.medianSlidingWindow(nums, k);
		assertArrayEquals(expected, actual);
	}
	@Test
	void test1() {
		int[] nums = {2147483647,2147483647};
		int k = 2;
		double[] expected = {2147483647};
		double[] actual = obj.medianSlidingWindow(nums, k);
		assertArrayEquals(expected, actual);
	}
			
    
//	@Test
//	void test1() {
//		int[] nums = {1,3,-1,-3,5,3,6,7};
//		int k = 5;
//		double[] expected = {1,3,3,5};
//		double[] actual = obj.medianSlidingWindow(nums, k);
//		assertArrayEquals(expected, actual);
//	}
//	
//	@Test
//	void test2() {
//		int[] nums = {1,3,-1,-3,5,3,6,7};
//		int k = 3;
//		double[] expected = {1,-1,-1,3,5,6};
//		double[] actual = obj.medianSlidingWindow(nums, k);
//		assertArrayEquals(expected, actual);
//	}

}
