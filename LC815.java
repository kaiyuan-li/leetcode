import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC815 {
	public int numBusesToDestination(int[][] routes, int S, int T) {
        if (S==T || routes.length == 0) return 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(S);
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i< routes.length; i++) {
            for (int start: routes[i]) {
                if (!map.containsKey(start)) { map.put(start, new HashSet<Integer>());}
                map.get(start).add(i);
            }
        }
        int count = 0;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addAll(map.get(S));
        while(queue.size()!=0) {
            count++;
            int len = queue.size();
            for (int i = 0; i<len; i++) {
                int currRoute = queue.pollFirst();
                for (int j :routes[currRoute]) {
                    if (j==T) return count;
                    if (!visited.contains(j)) {
                        visited.add(j);
                        queue.add(j);
                    }
                }
            }
        }
        return -1;
    }
}
