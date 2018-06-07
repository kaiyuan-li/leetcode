import java.util.Arrays;

public class LC220 {
	int rows, cols;
    
    
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        rows = grid.length;
        cols = grid[0].length;
        int[] map = new int[rows * cols];
        Arrays.fill(map, -1);
        for (int r = 0; r<rows;r++)
            for (int c = 0; c<cols; c++) {
                int idx = getIdx(r,c);
                if (grid[r][c] == '1') {
                	map[idx] = idx;
                    if (isValid(r-1, c) && grid[r-1][c] =='1') map[getRoot(map, getIdx(r-1,c))] = idx;
                    if (isValid(r, c-1) && grid[r][c-1] =='1') map[getRoot(map, getIdx(r,c-1))] = idx;
                }
            }
        int count = 0;
        for (int i = 0; i<map.length; i++) {
            if (map[i] == i) count++;
        }
        return count;
    }
    
    public int getIdx(int r, int c) {
        return r*cols + c;
    }
    
    public boolean isValid(int r, int c) {
        return r>-1 && c>-1;
    }
    
    public int getRoot(int[] map, int idx) {
        while (map[idx]!= idx) {
            idx = map[idx];
        }
        return idx;
    }
}
