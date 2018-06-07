import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC408Test {
	LC408 obj = new LC408();
	String word,abbr;
	boolean actual, expected;

	
	@Test
	void test() {

		word = "hi";
		abbr = "1";
		expected = false;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
		
		word = "internationalization";
		abbr = "i5a11o1";
		expected = true;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
		
		word = "apple";
		abbr = "a2e";
		expected = false;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
		

		word = "apple";
		abbr = "a3e";
		expected = true;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
		

		word = "internationalization";
		abbr = "i18n";
		expected = true;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
		

		word = "apple";
		abbr = "a1p1e";
		expected = true;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
	}
	@Test
	void test1() {
		word = "hi";
		abbr = "h0";
		expected = false;
		actual = obj.validWordAbbreviation(word, abbr);
		assertEquals(actual, expected);
		

	}

}
