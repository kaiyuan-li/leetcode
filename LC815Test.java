import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC815Test {
	LC815 obj = new LC815();
	@Test
	void test() {
		int[][] routes = {{1,3,7},{2,6,7}};
		int expected = 2;
		int actual = obj.numBusesToDestination(routes, 1, 6);
		assertEquals(expected,actual);
	}

}
