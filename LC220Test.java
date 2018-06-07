import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC220Test {
	LC220 obj = new LC220();
	@Test
	void test() {
		char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		int expected = 1;
		int actual = obj.numIslands(grid);
		assertEquals(expected,actual);
	
	}

}
