import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
class LC332Test {
	LC332 obj = new LC332();
	@Test
	void test() {
		String[][] tickets = new String[][] {{"JFK", "KUL"},{"JFK","NRT"},{"NRT","JFK"}};
		List<String> actual = obj.findItinerary(tickets);
		System.out.println(actual);
	}

}
