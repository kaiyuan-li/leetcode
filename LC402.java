
public class LC402 {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder sb = new StringBuilder();
        int p = 0;
        while (p<num.length() && sb.length() >p-k) {
            char ch = num.charAt(p);
            while(sb.length()>0 && sb.charAt(sb.length()-1)>ch && sb.length() >p - k) sb.delete(sb.length()-1, sb.length());
            sb.append(ch);
            p++;
        }
        sb.append(num.substring(p));
        sb.delete(num.length()-k, sb.length());
        p = 0;
        while (p<sb.length() && sb.charAt(p) == '0') p++;
        sb.delete(0,p);
        if (sb.length() == 0) return "0";
        return sb.toString();
    }
}
