import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC838Test {
	LC838 obj = new LC838();
	@Test
	void test() {
		String d = ".L.R...LR..L..";
		String expected = "LL.RR.LLRRLL..";
		String actual = obj.pushDominoes(d);
		assertEquals(expected, actual);
	}

}
