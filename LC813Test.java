import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC813Test {
	LC813 obj = new LC813();
	@Test
	void test() {
		int[] A = {9,1,2,3,9};
		int K = 3;
		double expected = 20;
		double actual = obj.largestSumOfAverages(A, K);
		assertEquals(expected, actual);
	}

}
