package slidingPuzzle;

class Board {
	public int[][] grid;	
	public Board(Board b) {
		this.grid = new int[b.grid.length][b.grid[0].length];
		for (int r = 0; r<b.grid.length; r++) {
			for (int c= 0; c< b.grid[0].length; c++)
				this.grid[r][c] = b.grid[r][c];
		}
	}
	
	public Board(String s, int rows, int cols) {
		this.grid = new int[rows][cols];
		for (int r = 0; r<rows; r++)
			for (int c = 0; c<cols; c++) {
				int idx = r*cols+c;
				this.grid[r][c] = s.charAt(idx) -'0';
			}
	}
	
	public int getDist() {
		int count = 0;
		for (int r = 0; r< this.grid.length; r++)
			for (int c = 0; c< this.grid[0].length; c++)
				if (r!=this.grid.length-1 || c!=this.grid[0].length -1) {
					count+= Math.abs(this.grid[r][c] - r*this.grid[0].length -c -1);
				} else {
					count+=Math.abs(this.grid[r][c]);
				}
		return count;
	}
	
	public void swap(int[] p0, int[] p1) {
		int temp = this.grid[p0[0]][p0[1]];
		this.grid[p0[0]][p0[1]] = this.grid[p1[0]][p1[1]];
		this.grid[p1[0]][p1[1]] = temp;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int r = 0; r< this.grid.length; r++)
			for (int c = 0; c< this.grid[0].length; c++)
				sb.append(grid[r][c]);
		return sb.toString();
	}
	
	public int[] getZero() {
		int[] res = new int[] {0,0};
		for (int r = 0; r< this.grid.length; r++)
			for (int c = 0; c< this.grid[0].length; c++)
				if (this.grid[r][c] == 0) res = new int[] {r,c};
		return res;
	}
}
