import java.util.*;

public class LC838 {
	public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        Queue<Integer> lIdx = new LinkedList<>();
        Queue<Integer> rIdx = new LinkedList<>();
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 'L') { lIdx.add(i); }
            else if (arr[i] == 'R') { rIdx.add(i); }
        }
        
        while (lIdx.size() > 0 || rIdx.size()>0) {
            if (lIdx.size()> 0) {
                int len = lIdx.size();
                for (int i = 0; i<len; i++) {
                    int idx = lIdx.poll();
                    if (idx -2 >-1 && arr[idx-2] == 'R' && arr[idx-1] == '.') arr[idx-1] = 'x';
                    if (idx -1 > -1 && arr[idx-1] == '.' && (idx-2<0 ||arr[idx-2]!='R')) {
                        arr[idx-1] = 'L';
                        lIdx.offer(idx-1);
                    }
                }
            }
            
            if (rIdx.size()> 0) {
                int len = rIdx.size();
                for (int i = 0; i<len; i++) {
                    int idx = rIdx.poll();
                    if (idx +1 <len && arr[idx+1] == '.' ) {
                        arr[idx+1] = 'R';
                        rIdx.offer(idx+1);
                    }
                }
            }
        }
        
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 'x') arr[i] = '.';
        }
        return new String(arr);
        
    }
}
