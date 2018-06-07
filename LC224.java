
public class LC224 {
	String numStr = "0123456789";
    public int calculate(String s) {
        int opd1 = 0;
        int optn = 0; // plus
        int opd2;
        int p = 0;
        while(s.charAt(p) == ' ') p++;
        while (p<s.length()) {
            int start = p;
            char ch = s.charAt(p);
            if (numStr.indexOf(ch)!=-1) {
                p = getNum(p, s);
                opd2 = Integer.parseInt(s.substring(start,p));
            } else {
                p = getParen(p, s);
                opd2 = calculate(s.substring(start+1, p-1));
            }
            opd1 = operation(opd1, opd2, optn);
            while(s.charAt(p) == ' ') p++;
            if (p<s.length() && s.charAt(p) == '+') {
                optn = 0;
            } else {
                optn = 1;
            }
            p++;
            while(s.charAt(p) == ' ') p++;
        }
        return opd1;
    }
    public int getNum(int p, String s) {
        while(p<s.length() && numStr.indexOf(s.charAt(p))!=-1) p++;
        return p;
    }
    
    public int getParen(int p, String s) {
        int count = 1;
        p++;
        while (count!=0) {
            if (s.charAt(p) == '(') { count ++;}
            else if (s.charAt(p) == ')') { count --;}
            p++;
        }
        return p;
    }
    public int operation(int a, int b, int op) {
        return op == 0? a+b:a-b;
    }
}
