import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC809Test {
	LC809 obj = new LC809();
	
	@Test
	void test() {
		String S = "heeellooo";
		String[] words = new String[] {"hello","hi","helo"};
		int actual = obj.expressiveWords(S, words);
		System.out.println(actual);
	}

}
