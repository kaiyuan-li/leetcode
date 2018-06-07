
public class LC327 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        int[] sum = new int[nums.length+1];
        for (int i = 0; i<nums.length; i++) {
            sum[i+1] = nums[i] + sum[i];
        }
        return mergesort(0, nums.length, lower, upper, sum);
    }
    
    private int mergesort(int l, int r, int lower, int upper, int[] sum) {
        if (l==r) return 0;
        int count = 0, mid = (l+r)/2;
        count += mergesort(l,mid,lower,upper,sum) + mergesort(mid+1,r,lower,upper,sum);
        int p = l, q = mid+1, a = mid+1;
        for (int i = l; i<mid+1; i++) {
            while(q<=r && sum[q]-sum[p]<lower)q++;
            while (a<=r && sum[a] - sum[p]<=upper)a++;
            count+=a-q;
        }
        int[] temp = new int[r-l+1];
        p = l;q= mid+1; a = 0;
        while (p<mid+1 && q<r+1) temp[a++] = sum[p] < sum[q] ? sum[p++] : sum[q++];
        while (p< mid+1) temp[a++] = sum[p++];
        while (q<r+1) temp[a++] = sum[q++];
        a = 0;
        while (a<temp.length) sum[l+a] = temp[a++];
        return count;
    }
}
