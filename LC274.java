
public class LC274 {
	public int hIndex(int[] citations) {
        int[] bucket = new int[citations.length+1];
        for (int c:citations) {
            if (c>=citations.length) {
                bucket[citations.length]++;
            } else {
                bucket[c]++;
            }            
        }
        int sum = 0, res = 0;
        for (int i = citations.length; i>-1; i--) {
            sum+=bucket[i];
            if (sum>=i) {
                res = i;
                break;
            }
        }
        return res;
    }
}
