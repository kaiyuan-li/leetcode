import java.util.*;

public class LC833 {
	public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int p = 0;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> indexes[a]-indexes[b]);
        for (int i = 0; i<indexes.length; i++) {
            pq.offer(i);
        }
        while (!pq.isEmpty()) {
            int idx = pq.poll();
            if (p<indexes[idx]) {
                sb.append(S.substring(p,indexes[idx]));
            }
            if (S.substring(indexes[idx], indexes[idx]+sources[idx].length()).equals(sources[idx])) {
                sb.append(targets[idx]);
            } else {
                sb.append(S.substring(indexes[idx], indexes[idx]+sources[idx].length()));
            }
            p = indexes[idx]+sources[idx].length();
        }
        sb.append(S.substring(p));
        return sb.toString();
    }
}
