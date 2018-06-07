import java.util.*;

public class LC656 {
	public List<Integer> cheapestJump(int[] A, int B) {
        LinkedList<Integer> res = new LinkedList<>();
        int[] dp = new int[A.length];
        int[] index = new int[A.length];
        dp[0] = A[0];
        for (int i = 1; i<A.length; i++) {
            if (A[i] == -1) continue;
            int min = Integer.MAX_VALUE;
            boolean found = false;
            for (int j = 1; j<B+1; j++) {
                int idx = i-j;
                if (idx < 0) break;
                if (A[idx] == -1) continue;
                found = true;
                if (A[idx] == 0) {index[i] = idx; dp[i] = dp[idx]; break;}
                if (dp[idx] < min) {
                    min = dp[idx];
                    index[i] = idx;
                } else if (dp[idx] == min) {
                    if (A[idx] <= A[index[i]])
                        index[i] = idx;
                }
            }
            if (!found) return res;
            dp[i] = min + A[i];
        }
        
        int p = A.length-1;
        while (p!=0) {
            res.offerFirst(p+1);
            p = index[p];
        }
        res.offerFirst(1);
        return res;
    }
}
