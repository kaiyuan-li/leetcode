
public class LC214 {
	public String shortestPalindrome(String s) {
        char[] chArr = new char[s.length()*2+1];
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            chArr[i] = ch;
            chArr[chArr.length-1-i] = ch;
        }
        chArr[s.length()] = '*';
        int[] idxArr = new int[chArr.length];
        for (int i = 1; i<idxArr.length; i++) {
            int idx = idxArr[i-1];
            while (idx>0 && chArr[idx] != chArr[i]) {
            	idx = idxArr[idx-1];
            }
            idxArr[i] = idx;
            if (chArr[i] == chArr[idx]) idxArr[i]++;
        }
        int len = idxArr[idxArr.length-1];
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() -1; i>=len; i--) {
            sb.append(s.charAt(i));
        }
        sb.append(s);
        return sb.toString();
    }
}
