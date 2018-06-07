import java.util.ArrayList;
import java.util.List;

public class LC163 {
	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        ArrayList<String> res = new ArrayList<>();
        int curr = lower, p = 0;
        while (p<nums.length) {
        	while(p<nums.length && nums[p]==curr) {
        		curr++;
        		p++;
        	}
        	if (p<nums.length) {
        		if (nums[p] == curr+1) {
        			res.add(Integer.toString(curr));
        		} else {
        			res.add(Integer.toString(curr) + "->" + Integer.toString(nums[p]-1));
        		}
        		curr = nums[p];
        	}
        	
        }
        if (upper  == curr) {
			res.add(Integer.toString(curr));
		} else {
			res.add(Integer.toString(curr) + "->" + Integer.toString(upper));
		}
        
        return res;
    }
}
