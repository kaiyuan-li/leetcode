import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC4Test {
	LC4 obj = new LC4();
	@Test
	void test() {
		int[] nums1 = new int[] {};
		int[] nums2 = new int[] {1};
		double actual = obj.findMedianSortedArrays(nums1, nums2);
		System.out.println(actual);
	}

}
