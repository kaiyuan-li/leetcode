import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC846Test {
	LC846 obj = new LC846();
	@Test
	void test() {
		int[] hand = new int[] {1,2,2,3,3,4,6,7,8};
		int W = 3;
		boolean actual = obj.isNStraightHand(hand, W);
		System.out.println(actual);
	}

}
