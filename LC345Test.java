import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LC345Test {

	@Test
	void test() {
		LC345 obj = new LC345();
		
		String input, expected, actual;
		input = "LeetCode";
		expected = "LeotCede";
		actual = obj.reverseVowels(input);
		assertEquals(actual, expected);
		
		input = "foAd";
		expected = "fAod";
		actual = obj.reverseVowels(input);
		assertEquals(actual, expected);
		
		input = "paqdt";
		expected = "paqdt";
		actual = obj.reverseVowels(input);
		assertEquals(actual, expected);
		
		input = "pq";
		expected = "pq";
		actual = obj.reverseVowels(input);
		assertEquals(actual, expected);
		
		input = "";
		expected = "";
		actual = obj.reverseVowels(input);
		assertEquals(actual, expected);
		
	}
	
	

}
