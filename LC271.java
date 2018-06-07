import java.util.*;
public class LC271 {
	public String encode(List<String> strs) {
        if (strs.size() == 0) return "empty";
        StringBuilder sb = new StringBuilder();
        sb.append("startbab");
        for (String str:strs) {
            str.replaceAll("a", "aa");
            sb.append(str);
            sb.append("bab");
        }
        sb.append("end");
        
        return sb.toString();
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        LinkedList<String> res = new LinkedList<>();
        if (s.equals("empty")) return res;
        String[] arr = s.split("bab");
        for (String str : arr) {
            str.replaceAll("aa", "a");
            res.add(str);
        }
        res.removeFirst();
        res.removeLast();
        return res;
    }
}
