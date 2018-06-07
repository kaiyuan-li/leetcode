import java.util.*;
public class LC809 {
    public int expressiveWords(String S, String[] words) {
        List<Integer> counts = new ArrayList<>();
        String shortS = getShort(S, counts);
        int count = 0;
        for (int i = 0; i<words.length; i++) {
            List<Integer> countArr = new ArrayList<>();
            words[i] = getShort(words[i], countArr);
            if (words[i].equals(shortS) && isCountValid(counts, countArr)) count++;
        }
        return count;
    }
    
    private String getShort(String S, List<Integer> countS) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        char currentChar = S.charAt(0);
        for (int i = 0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == currentChar) { count ++ ;}
            else {
                countS.add(count);
                count = 1;
                currentChar = ch;
                sb.append(ch);
            }
        }
        countS.add(count);
        return sb.toString();
    }
    
    private boolean isCountValid(List<Integer> c1, List<Integer> c2) {
        for (int i = 0; i< c1.size(); i++) {
            int n1 = c1.get(i), n2 = c2.get(i);
            if (n2 == n1) { continue;}
            else if (n2 - n1 < 2) { return false; }
        }
        return true;
    }
}
