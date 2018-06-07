
public class LC31 {
	public void nextPermutation(int[] nums) {
        int end = nums.length-1, p = end;
        while (p>0 && nums[p-1]>=nums[p]) p--;
        if (p!=0) {
            swap(nums, p, p-1);
        }
        
    }
    
    void swap(int[] nums, int i, int j) {
        
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
}
