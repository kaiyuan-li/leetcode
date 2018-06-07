
import java.util.*;
public class LC315 {
	public List<Integer> countSmaller(int[] nums) {
        if (nums.length == 0) return new ArrayList<Integer>();
        int len = nums.length;
        int[][] arr = new int[len][3];
        for (int i = 0; i<len; i++) {
            arr[i][0] = nums[i];
            arr[i][2] = i;
        }
        
        mergeSort(arr, 0, len-1);
        int[] res = new int[len];
        for (int i = 0; i<len; i++) {
            int idx = arr[i][2];
            res[idx] = arr[i][1];
        }
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i< len; i++)
            li.add(res[i]);
        return li;
    }
    
    private void mergeSort(int[][] arr, int l, int r) {
        if (l==r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1, r);
        int p = l, q = mid+1;
        while (p<mid+1) {
            while (q<r+1 && arr[q][0] < arr[p][0]) q++;
            arr[p][1] +=q-mid-1;
            p++;
        }
        int[][] temp = new int[r-l+1][3];
        p = l; q= r; int i = 0;
        while (p<mid+1 && q < r+1) {
            if (arr[p][0] < arr[q][0]) {
                temp[i++] = arr[p++];
            }else{
                temp[i++] = arr[q++];
            }
        }
        while (p<mid+1) {
            temp[i++] = arr[p++];
        }
        while (q<r+1) {
            temp[i++] = arr[q++];
        }
        p = l; i = 0;
        while (p<r+1) {
            arr[p++] = temp[i++];
        }
    }
}
