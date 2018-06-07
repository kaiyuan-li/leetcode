
public class LC345 {
	public String reverseVowels(String s) {

		char[] chArr = s.toCharArray();
		int start = 0, end = chArr.length-1;
		while(start<end) {
			while (start<end && !isVowel(chArr[start])) start++ ;
			while (start<end && !isVowel(chArr[end])) end--;
			if (start!=end) {
				char tmp = chArr[start];
				chArr[start] = chArr[end];
				chArr[end] = tmp;
			}
			start++; end--;
		}
		return String.valueOf(chArr);
	}
	public boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}
}
