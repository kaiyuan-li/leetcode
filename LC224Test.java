import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC224Test {
	LC224 obj = new LC224();
	@Test
	void test() {
		String s = "1 + 1";
		int actual = obj.calculate(s);
		int expected = 2;
		assertEquals(expected, actual);
	}

}
