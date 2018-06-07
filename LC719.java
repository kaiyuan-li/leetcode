import java.util.Arrays;

public class LC719 {
	public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] diff = new int[nums.length][nums.length];
        for (int i = 0; i<nums.length-1; i++)
            for (int j = i+1; j<nums.length; j++)
                diff[i][j] = nums[j]-nums[i];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<nums.length-1; i++) {
            min = Math.min(min, diff[i][i+1]);
        }
        int max = nums[nums.length-1] - nums[0];
        int mid;
        while (min != max) {
            int count = 0;
            mid = (min + max) /2 ;
            for (int r = 0; r<diff.length-1; r++) {
                int c = r+1;
                while(c<diff.length && diff[r][c] <= mid) {c++; count++; }
            }
            if (count > k) { max = mid; }
            else { min = mid+1;}
        }
        return min;
    }
}
