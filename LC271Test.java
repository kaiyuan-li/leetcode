import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class LC271Test {
	LC271 obj = new LC271();
	@Test
	void test() {
		List<String> strs = new ArrayList<>();
		strs.add("");
		strs.add("");
		List<String> actual = obj.decode(obj.encode(strs));
		System.out.println(actual);
		
	}

}
