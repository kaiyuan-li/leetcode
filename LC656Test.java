import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class LC656Test {
	LC656 obj = new LC656();
	@Test
	void test() {
		int[] nums = new int[] {1,2,4,-1,2};
		int B = 2;
		List<Integer> actual = obj.cheapestJump(nums, B);
		System.out.println(actual);
	}

}
