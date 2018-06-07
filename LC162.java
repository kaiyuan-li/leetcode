
public class LC162 {
	public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length-1, mid = 0;
        while (l!=r) {
            mid = (l+r)>>1;
            if (nums[mid]>nums[mid+1]) {
                r = mid;
            } else {
                l = mid+1;
            }
        }
        return mid;
    }
}
