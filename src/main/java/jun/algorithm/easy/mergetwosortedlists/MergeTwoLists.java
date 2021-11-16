package jun.algorithm.easy.mergetwosortedlists;

public class MergeTwoLists {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(5)));
		ListNode returned = mergeTwoLists(l1, l2);
		
		while (returned != null) {
			System.out.println(returned.val);
			returned = returned.next;
		}
//		while (l1 != null) {
//			System.out.println(l1.val);
//			l1 = l1.next;
//		}
//		while (l2 != null) {
//			System.out.println(l2.val);
//			l2 = l2.next;
//		}
		
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) return null;
		ListNode newHead = new ListNode(0);
		ListNode currentHead = newHead;
		
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				currentHead.next = l2;
				l2 = l2.next;
			} else {
				currentHead.next = l1;
				l1 = l1.next;
			}
			currentHead = currentHead.next;
		}  
		if (l1 != null) {
			currentHead.next = l1;
		}
		
		if (l2 != null) {
			currentHead.next = l2;
		}
		
		return newHead.next;
	}
}
