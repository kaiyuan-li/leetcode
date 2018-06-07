import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC146Test {
	LC146 obj = new LC146(2);
	@Test
	void test() {
		ArrayList<Integer> actual = new ArrayList<>();
		int[] expected = {1,-1,-1,3,4};
		obj.put(1, 1);
		obj.put(2, 2);
		actual.add(obj.get(1));
		obj.put(3, 3);
		actual.add(obj.get(2));
		obj.put(4, 4);
		actual.add(obj.get(1));
		actual.add(obj.get(3));
		actual.add(obj.get(4));
		assertTrue(Arrays.asList(expected).equals(actual));
	}

}
