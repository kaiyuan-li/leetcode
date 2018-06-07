package slidingPuzzle;
import java.util.*;

class SlidingPuzzleSolver {
	public int solve(Board board) {
		Queue<Board> queue = new LinkedList<>();
		Set<String> set = new HashSet<>();
		queue.offer(board);
		int[][] dirs = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
		int count = 0;
		set.add(board.toString());
		while(!queue.isEmpty()) {
			int len = queue.size();
			for (int i = 0; i<len; i++) {
				Board b = queue.poll();
				if (b.getDist()==0) return count;
				int[] pos0 = b.getZero();
				for (int[] d:dirs) {
					int[] newPos = new int[] {d[0]+pos0[0], d[1]+pos0[1]};
					if (newPos[0]>-1 && newPos[1]>-1 && newPos[0]<board.grid.length && newPos[1] < board.grid[0].length) {
						Board nextBoard = new Board(b);
						nextBoard.swap(newPos, pos0);
						if (set.contains(nextBoard.toString())) continue;
						queue.offer(nextBoard);
						set.add(nextBoard.toString());
					}
						
				}
			}
			count++;
		}
		return -1;
	}
	
}
