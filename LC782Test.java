import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC782Test {
	LC782 obj = new LC782();
	@Test
	void test() {
		int[][] board = new int[][] {{1,0,0},{0,1,1}, {1,0,0}};
		int actual = obj.movesToChessboard(board);
		int expected = 1;
		assertEquals(expected,actual);
	}

}
