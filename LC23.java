import java.util.PriorityQueue;

public class LC23 {
	
	
	public ListNode mergeKLists(ListNode[] lists) {
        ListNode root = new ListNode(0);
        ListNode currentNode = root;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((l1, l2)->l1.val - l2.val);
        for (int i = 0; i<lists.length; i++) {
        	if (lists[i]!=null) heap.add(lists[i]);
        }
        while (heap.size()!=0) {
            ListNode minNode = heap.poll();
            if (minNode.next!= null) heap.add(minNode.next);
            currentNode.next = minNode;
            currentNode = currentNode.next;
        }
        return root.next;
    }
}

