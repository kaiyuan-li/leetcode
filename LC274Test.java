import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC274Test {
	LC274 obj = new LC274();
	@Test
	void test() {
		int[] nums = {3,0,6,1,5};
		int expected = 3;
		int actual = obj.hIndex(nums);
		assertEquals(expected,actual);
	}

}
