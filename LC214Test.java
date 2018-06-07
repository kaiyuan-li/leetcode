import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC214Test {
	LC214 obj = new LC214();
	@Test
	void test() {
		String s = "aacecaaa";
		String actual = obj.shortestPalindrome(s);
		System.out.println(actual);
	}

}
