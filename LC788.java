
public class LC788 {
	public int rotatedDigits(int N) {
        // find all numbers composed of 2,5,6,9,0,1,8 and not only composed of 0,1,8
        int[] count1 = new int[]{0,1,2,2,2,2,2,2,2,3,3}; // for 0, 1, 8
        int[] digit1 = new int[]{1,1,0,0,0,0,0,0,1,0};
        int[] count2 = new int[]{0,1,2,3,3,3,4,5,5,6,7};// for 0,1,2,5,6,8,9
        int[] digit2 = new int[]{1,1,1,0,0,1,1,0,1,1};
        return getNum(N, count2, digit2) - getNum(N,count1, digit1);
    }
    
    private int getNum(int n, int[] count, int[] digit) {
        int total = count[count.length-1];
        if (n < 10) return count[n+1];
        int c = 0;
        String str = Integer.toString(n);
        int len = str.length();
        int firstDigit = str.charAt(0) -'0';
        c+=count[firstDigit] * Math.pow(total, len-1);
        if (digit[firstDigit] == 1 || str.charAt(1) == '0') c+= getNum(Integer.parseInt(str.substring(1)), count, digit);
        return c;
    }
}
