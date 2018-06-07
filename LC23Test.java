import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC23Test {
	LC23 obj = new LC23();
	ListNode l1 = new ListNode(1);

	ListNode l2 = new ListNode(4);
	ListNode l3 = new ListNode(5);
	ListNode l4 = new ListNode(1);
	ListNode l5 = new ListNode(3);
	ListNode l6 = new ListNode(4);
	ListNode l7 = new ListNode(2);
	ListNode l8 = new ListNode(6);
	
	@Test
	void test() {
		l1.next = l2;
		l2.next = l3;
		l4.next = l5;
		l5.next = l6;
		l7.next = l8;
		ListNode[] lists = {l1, l4, l7};
		ListNode actual = obj.mergeKLists(lists);
		int[] actualArr = new int[8];
		int idx = 0;
		while (actual!=null) {
			actualArr[idx++] = actual.val;
			actual = actual.next;
		}
		int[] expectedArr = {1,1,2,3,4,4,5,6};
		assertArrayEquals(actualArr, expectedArr);
	}

}
