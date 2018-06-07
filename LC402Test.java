import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC402Test {
	LC402 obj = new LC402();
	@Test
	void test() {
		String num = "112";
		int k = 1;
		String actual = obj.removeKdigits(num, k);
		System.out.println(actual);
	}

}
