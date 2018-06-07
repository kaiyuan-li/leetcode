import java.util.*;

public class LC269 {
	public String alienOrder(String[] words) {
//        Map<Character, Set<Character>> fromMap = new HashMap<>(), toMap = new HashMap<>();
//        Set<Character> chSet = new HashSet<>();
//        for (String w :words){
//            for (char ch : w.toCharArray()) {
//                chSet.add(ch);
//            }
//        }
//        for (char ch:chSet) {
//            fromMap.put(ch, new HashSet<>());
//            toMap.put(ch, new HashSet<>());
//        }
//        
//        for (int i = 0; i<words.length-1; i++) {
//            String w1 = words[i], w2 = words[i+1];
//            int p = 0;
//            if (w1.startsWith(w2) || w2.startsWith(w1)) continue;
//            while (w1.charAt(p) == w2.charAt(p)) p++;
//            char ch1 = w1.charAt(p), ch2 = w2.charAt(p);
//            fromMap.get(ch2).add(ch1);
//            toMap.get(ch1).add(ch2);
//        }
//        StringBuilder sb = new StringBuilder();
//        Queue<Character> queue = new LinkedList<>();
//        for (char ch : fromMap.keySet()) {
//            if (fromMap.get(ch).size() == 0) queue.offer(ch);
//        }
//        while (!queue.isEmpty()) {
//            char ch = queue.poll();
//            sb.append(ch);
//            for (char toCh : toMap.get(ch)) {
//                fromMap.get(toCh).remove(ch);
//                if (fromMap.get(toCh).size() == 0){
//                    queue.offer(toCh);
//                }
//            }
//        }
//        if (sb.length() != chSet.size()) return "";
//        return sb.toString();
		List<Set<Character>> toMap = new ArrayList<>();
        for (int i = 0; i<26; i++){
            toMap.add(new HashSet<>());
        }
        int[] degree = new int[26];
        Set<Character> charSet = new HashSet<>();
        for (String w : words) {
            for (char ch : w.toCharArray()) {
                charSet.add(ch);
            }
        }
        
        for (int i = 0; i<words.length-1; i++) {
            String w1 = words[i], w2 = words[i+1];
            if (w2.startsWith(w1)) continue;
            int p = 0;
            while (w1.charAt(p) == w2.charAt(p)) p++;
            toMap.get(w1.charAt(p)-'a').add(w2.charAt(p));
            degree[w2.charAt(p) - 'a'] ++;
        }
        
        Queue<Character> queue = new LinkedList<>();
        for (char ch:charSet) {
            if (degree[ch-'a'] == 0) queue.offer(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char ch = queue.poll();
            sb.append(ch);
            for (char next : toMap.get(ch-'a')) {
                degree[next-'a'] --;
                if (degree[next-'a'] == 0) queue.offer(next);
            }
        }
        if (sb.length() != charSet.size()) return "";
        return sb.toString();
        
    }
}
