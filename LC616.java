import java.util.ArrayList;

public class LC616 {
	public String addBoldTag(String s, String[] dict) {
		ArrayList<int[]> intervals = new ArrayList<>();
        for (String w :dict) {
            int len = w.length();
            int idx = s.indexOf(w);
            while (idx != -1) {
                int[] itv = new int[]{idx, idx+len};
                intervals.add(itv);
                idx = s.indexOf(w, idx+len);
            }
        }
        intervals.sort((a,b)->a[0]-b[0]);
        ArrayList<int[]> merged = new ArrayList<>();
        if (intervals.size() == 0) return s;
        int start = intervals.get(0)[0];
        int end = intervals.get(0)[1];
        for (int[] itv : intervals) {
            if (itv[0] <= end) {
                end = Math.max(itv[1], end);
            } else {
                merged.add(new int[]{start, end});
                start = itv[0];
                end = itv[1];
            }
        }
        merged.add(new int[]{start, end});
        StringBuilder sb = new StringBuilder(s);
        for (int i = merged.size()-1; i>-1; i--) {
            int[] itv = merged.get(i);
            sb.insert(itv[1], "</b>");
            sb.insert(itv[0], "<b>");
        }
        return sb.toString();
    }
}
