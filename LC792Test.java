
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class LC792Test {
	LC792 obj;

	@Before
	public void setup() {
		this.obj = new LC792();
	}
	
	@Test
	public void test() {
		String str = "abcde";
		String[] dict = new String[]{"a", "bb", "acd", "ace"};
		int actual = obj.numMatchingSubseq(str, dict);
		int expected = 3;
		assertEquals(expected,actual);
	}

}
