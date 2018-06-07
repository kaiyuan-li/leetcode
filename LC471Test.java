import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC471Test {
	LC471 obj = new LC471();
	@Test
	void test() {
		String s = "abcdabcdaabcdabcdaabcdabcda";
		System.out.println(obj.encode(s));
	}

}
