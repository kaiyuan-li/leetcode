import java.util.HashMap;
import java.util.List;

public class LC139 {
	public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();
        return canGet(s, wordDict, map);
    }
    public boolean canGet(String s, List<String> dict, HashMap<String, Boolean> map){
        if (s.equals("")) return true;
        if (map.containsKey(s)) return map.get(s);
        for (String word : dict) {
            if (s.indexOf(word) == 0 && canGet(s.substring(word.length()), dict, map)) {
                map.put(s, true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}
