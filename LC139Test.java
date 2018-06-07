import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class LC139Test {
	LC139 obj = new LC139();
	@Test
	void test() {
		String s = "leetcode";
		List<String> dict = new ArrayList<>();
		dict.add("leet");
		dict.add("code");
		boolean expected = true;
		boolean actual = obj.wordBreak(s, dict);
		assertEquals(expected,actual);
	}

}
