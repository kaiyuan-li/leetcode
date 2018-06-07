import java.util.*;

public class LC126 {
	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(beginWord)) wordList.add(beginWord);
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] visitedFrom = new int[wordList.size()];
        Arrays.fill(visitedFrom, -1);
        for (int i = 0; i<wordList.size(); i++) {
            map.put(i, new HashSet<>());
        }
        for (int i = 0; i<wordList.size()-1; i++) {
            for (int j = 0; j<wordList.size();j++) {
                if (isSimilar(wordList.get(i), wordList.get(j))){
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
                
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        int start = wordList.indexOf(beginWord);
        visitedFrom[start] = start;
        int target = wordList.indexOf(endWord);
        queue.offer(start);
        boolean found = false;
        List<List<String>> res = new ArrayList<>();
        while (!found && !queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i<len; i++) {
                int curr = queue.poll();
                for (int next : map.get(curr)) {
                    if (visitedFrom[next] != -1) continue;
                    if (next == target) {
                        LinkedList<String> wordArray = new LinkedList<>();
                        wordArray.add(wordList.get(target));
                        int currIdx = curr;
                        while (visitedFrom[currIdx]!=currIdx) {
                            wordArray.addFirst(wordList.get(currIdx));
                            currIdx = visitedFrom[currIdx];
                        }
                        wordArray.addFirst(wordList.get(currIdx));
                        res.add(wordArray);
                    } else {
                    	visitedFrom[next] = curr;
                    	queue.offer(next);
                    }
                }
                
            }
        }
        return res;
        
    }
    
    public boolean isSimilar(String a, String b) {
        int count = 0;
        for (int i = 0; i<a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) count++;
            if (count > 1) return false;
        }
        return count == 1;
    }
}
