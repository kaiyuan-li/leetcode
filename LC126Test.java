import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class LC126Test {
	LC126 obj = new LC126();
	@Test
	void test() {
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		String start = "hit";
		String end = "cog";
		List<List<String>> actual = obj.findLadders(start, end, wordList);
		System.out.println(actual);
	}

}
