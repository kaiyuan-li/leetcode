import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC833Test {
	LC833 obj = new LC833();
	@Test
	void test() {
		int[] indexes = {3,5,1};
		String S = "vmokgggqzp";
		String[] sources = {"kg", "ggq", "mo"};
		String[] targets = {"s", "so", "bfr"};
		String expected = "vbfrssozp";
		String actual = obj.findReplaceString(S, indexes, sources, targets);
		assertEquals(expected, actual);
	}

}
