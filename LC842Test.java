import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class LC842Test {
	LC842 obj = new LC842();
	@Test
	void test() {
		String input = "11235813";
		List<Integer> actual = obj.splitIntoFibonacci(input);
	}

}
