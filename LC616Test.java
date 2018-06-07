import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC616Test {
	LC616 obj = new LC616();
	@Test
	void test() {
		String str = "abcxyz123";
		String[] dict = new String[] {"abc", "123"};
		String expected ="<b>abc</b>xyz<b>123</b>";
		String actual = obj.addBoldTag(str, dict);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		String str = "abcabcxyz123";
		String[] dict = new String[] {"abc", "123"};
		String expected ="<b>abcabc</b>xyz<b>123</b>";
		String actual = obj.addBoldTag(str, dict);
		assertEquals(expected, actual);
	}

}
