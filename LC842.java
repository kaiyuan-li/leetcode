import java.util.*;

public class LC842 {
	public List<Integer> splitIntoFibonacci(String S) {
        String maxStr = Integer.toString(Integer.MAX_VALUE);
        for (int i = 1; i<=S.length()/3+1; i++)
            for (int j = 1; j<S.length()/3+1; j++) {
                List<Integer> res = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                String s1 = S.substring(0,i);
                String s2 = S.substring(i,i+j);
                if (s2.length()>1 && s2.charAt(0)=='0' || s2.length() >= maxStr.length() ) continue;
                if (s1.length()>1 && s1.charAt(0)=='0'|| s1.length() >= maxStr.length() ) continue;
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                sb.append(n1);
                sb.append(n2);
                res.add(n1);
                res.add(n2);
                while (sb.length()<S.length()) {
                    int n3 = n1+n2;
                    sb.append(n3);
                    res.add(n3);
                    n2 = n3;
                    n1 = n2;
                }
                if (S.equals(sb.toString())) return res;
            }
        return new ArrayList<>();
    }
}
