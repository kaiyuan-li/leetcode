import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC327Test {
	LC327 obj = new LC327();
	@Test
	void test() {
		int[] nums = new int[] {-2,5,-1};
		int lower = -2, upper = 2;
		int actual = obj.countRangeSum(nums, lower, upper);
		System.out.println(actual);
	}

}
