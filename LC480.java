import java.util.Collections;
import java.util.PriorityQueue;

public class LC480 {
	public double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> upper, lower;
        upper = new PriorityQueue<>();
        lower = new PriorityQueue<>(Collections.reverseOrder());
        double[] res = new double[nums.length-k+1];
        for (int i = 0; i< k-1; i++) {
        	pushInQueue(upper, lower, nums[i]);
        }
        boolean isOdd = k % 2 == 1;
        for (int i = k-1; i<nums.length; i++) {
        	pushInQueue(upper, lower, nums[i]);
        	res[i-k+1] = isOdd ? upper.peek() : upper.peek()/2d + lower.peek()/2d;
        	popFromQueue(upper, lower, nums[i-k+1]);
        }
        return res;
    }
	
	void pushInQueue (PriorityQueue<Integer> upper, PriorityQueue<Integer> lower, int n) {
		lower.add(n);
		upper.add(lower.poll());
		if (upper.size() > lower.size() + 1) {
			lower.add(upper.poll());
		}
		
	}
	
	void popFromQueue (PriorityQueue<Integer> upper, PriorityQueue<Integer> lower, int n) {
		if (upper.contains(n)) {
			upper.remove(n);
		} else {
			lower.remove(n);
		}
	}
}
