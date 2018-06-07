
public class LC813 {
	public double largestSumOfAverages(int[] A, int K) {
        double[][] dp = new double[A.length][K];
        double sum = 0;
        for (int i = 0, n=1; i<A.length; i++, n++) {
            sum+=A[i];
            dp[i][0] = sum / n;
            if (i<K) dp[i][i] = sum;
        }
        for (int i = 1; i<K; i++) {
            for (int j = i+1; j<A.length; j++) {
                double s  = 0;
                double max = 0;
                for (int k = j, n = 1; k> i-1; k--, n++) {
                    s+=A[k];
                    max = Math.max(s/n+dp[k-1][i-1] , max);
                }
                dp[j][i] = max;
            }
        }
        return dp[A.length-1][K-1];
    }
}
