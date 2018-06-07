import java.util.Arrays;

public class LC782 {
    public int movesToChessboard(int[][] board) {
        int size = board.length;
        int cr1 = 1, cr2 = 1;// count rows
        int[] row1 = board[0], row2 = board[0];
        for (int i = 1; i<board.length; i++) {
            if (Arrays.equals(board[i], row1)) {
                cr1 ++;
            }else if (row2 == board[0]) {
                row2 = board[i];
            } else if (Arrays.equals(board[i], row2)){
                cr2 ++;
            } else return -1;
        }
        
        if (!isOpposite(row1, row2)) return -1;
        if (size % 2 == 0) {
            if (cr1!=cr2) return -1;
            int sum = 0, misC = 0, misR = 0;
            for (int i = 0; i< size; i++) {
                sum+=row1[i];
                misC += Math.abs(i%2 - row1[i]%2);
                misR += Math.abs(i%2 - board[i][0]%2);
            }
            misC = Math.min(misC, size-misC);
            misR = Math.min(misR, size-misR);
            if (sum!=size/2) return -1;
            return (misC + misR)/2;
        }
        if (size % 2 == 1) {
            if (Math.abs(cr1-cr2)!=1) return -1;
            int[] dominantRow = cr1 > cr2? row1 : row2;
            int c1 = 0;
            for (int i = 0; i<size; i++) c1+=dominantRow[i];
            if (Math.abs(c1 * 2-size)!=1) return -1;
            int dominantDigit = c1 * 2 > size ? 1 : 0;
            int dominantCol = 0;
            while(dominantRow[dominantCol] != dominantDigit) dominantCol++;
            int misC = 0, misR = 0;
            for (int i = 0; i< size; i++) {
                misC += Math.abs((i+dominantDigit)%2 - dominantRow[i]%2);
                misR += Math.abs((i+dominantDigit)%2 - board[i][dominantCol]%2);
            }
            return (misC + misR)/2;
        }
        return 0;
    }
    
    private boolean isOpposite(int[] a, int[] b) {
        for (int i = 0; i< a.length; i++) {
            if (a[i] + b[i] != 1) return false;
        }
        return true;
    }
}
