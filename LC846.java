
public class LC846 {
	public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        if (hand.length == 0) return true;
        if (W == 1) return true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : hand) {
            min = Math.min(min,n);
            max = Math.max(max, n);
        }
        int[] count = new int[max+1];
        for (int n : hand) {
            count[n]++;
        }
        
        int[] num = new int[W-1];
        num[0] = count[min];
        for (int i = min+1; i<=max; i++) {
            int n = count[i];
            if(!isAllZero(num) && count[i-1]+1!=count[i]) return false;
            for (int j = num.length-1; j>0; j--) {
                if (n < num[j]) return false;
                n-=num[j];
                num[j] = num[j-1];
            }
            if (n<num[0]) {return false;}
            else {n-=num[0];num[0] = n;}
        }
        return isAllZero(num);
        
    }
    private boolean isAllZero(int[] num) {
        for (int n:num)
            if (n!=0) return false;
        return true;
    }
}
