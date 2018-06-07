import java.util.*;
public class LC792 {
	public int numMatchingSubseq(String S, String[] words) {
        List<Map<String, Integer>> map = new ArrayList<>();
        for (int i = 0; i<26; i++) 
            map.add(new HashMap<>());
        for (String s : words) {
            Map<String, Integer> currMap = map.get(s.charAt(0)-'a');
            currMap.put(s, 1);
        }
        int res = 0;
        for (char ch : S.toCharArray()) {
            Map<String, Integer> currMap = map.get(ch-'a');
            Set<String> s = currMap.keySet();
            for (String key:s) {
                if (key.length() == 1) {
                    res += currMap.get(key);
                } else {
                    String nextKey = key.substring(1);
                    Map<String, Integer> nextMap = map.get(nextKey.charAt(0) - 'a');
                    if (nextMap.containsKey(nextKey)) {
                        nextMap.put(nextKey, nextMap.get(nextKey) + 1);
                    } else {
                        nextMap.put(nextKey, 1);
                    }
                }
                currMap.remove(key);
            }
        }
        return res;
    }
}
