package slidingPuzzle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlidingPuzzleSolverTest {
	SlidingPuzzleSolver solver = new SlidingPuzzleSolver();
	@Test
	void test() {
		Board board = new Board("876543210", 3, 3);
		int actual = solver.solve(board);
		System.out.println(actual);
	}

}
