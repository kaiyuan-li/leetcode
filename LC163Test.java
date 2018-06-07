import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC163Test {

	LC163 obj;
	@BeforeEach
	void setup() {
		obj = new LC163();
	}
	@Test
	void test() {
		int[] nums = {0,1,3,50,57};
		int lower = 0;
		int upper = 99;
		List<String> expected = new ArrayList<>();
		expected.add("2");
		expected.add("4->49");
		expected.add("51->56");
		expected.add("58->99");
		List<String> actual = obj.findMissingRanges(nums,lower,upper);
		assertEquals(expected, actual);
	}

}
