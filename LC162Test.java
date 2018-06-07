import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC162Test {
	LC162 obj;
	@BeforeEach
	public void setup() {
		 obj = new LC162();
	}
	@Test
	void test() {
		int[] nums = {1,2,3,1};
		int expected = 2;
		int actual = obj.findPeakElement(nums);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		int[] nums = {1,2,1,3,5,6,4};
		int expected = 5;
		int actual = obj.findPeakElement(nums);
		assertEquals(expected, actual);
	}
}
