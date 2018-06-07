import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC743Test {
	LC743 obj = new LC743();
	@Test
	void test() {
		int[][] times = new int[][] {{2,1,1},{2,3,1},{3,4,1}};
		int N = 4;
		int K = 2;
		int expected = 2;
		int actual;
		actual = obj.networkDelayTime(times, N, K);
		assertEquals(expected, actual);
	}

}
