import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC315Test {
	LC315 obj;
	@BeforeEach
	void setup() {
		this.obj = new LC315();
	}
	@Test
	void test() {
		int[] nums = new int[] {5,2,6,1};
		System.out.println(this.obj.countSmaller(nums));
	}

}
