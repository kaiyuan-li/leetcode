import java.util.*;
public class LC332 {
	public List<String> findItinerary(String[][] tickets) {
        Map<String, List<String>> map = new HashMap<>();
        for (String[] t : tickets) {
            String from = t[0], to = t[1];
            if (!map.containsKey(from)) {
                List<String> toList = new ArrayList<>();
                map.put(from, toList);
            }
            map.get(from).add(to);
        }
        for (List<String> toList : map.values()) {
            Collections.sort(toList);
        }
        List<String> res = new ArrayList<>();
        dfs("JFK", map, res, tickets.length+1);
        return res;
    }
    
    private boolean dfs(String from, Map<String, List<String>> map, List<String> res, int count) {
        res.add(from);
        if (res.size() == count) return true;
        List<String> toList = map.get(from);
        for (int i = 0; i<toList.size(); i++) {
            String s = toList.get(i);
            toList.remove(i);
            if (dfs(s, map, res, count)) return true;
            toList.add(i, s);
        }
        res.remove(res.size()-1);
        return false;
    }
}
