
public class LC408 {
	public boolean validWordAbbreviation(String word, String abbr) {
		int pw = 0, pa = 0;
		while (pw<word.length() && pa<abbr.length()) {
			int count = 0;
			if (abbr.charAt(pa) == '0') return false;
			while (pa<abbr.length() && isNum(abbr.charAt(pa))) {
				int n = abbr.charAt(pa) - '0';
				count = count * 10 + n;
				pa++;
			}
			if (count != 0) {
				pw += count;
			} else if (word.charAt(pw)!= abbr.charAt(pa)) {
				return false;
			} else {
				pw++; pa++;
			}
		}
		return pw == word.length() && pa == abbr.length();
	}
	public boolean isNum (char ch) {
		return "0123456789".indexOf(ch)!=-1;
	}
}
