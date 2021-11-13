package jun.algorithm.linkedlist;

public class LinkedListProb {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
//		node5.next = null;

		Solution.removeNthFromEnd(node1, 1);
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static class Solution {
		public static ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode newHead = new ListNode(0);
			newHead.next = head;

			ListNode first = newHead;
			ListNode second = newHead;

			for (int i = 1; i <= n + 1; i++) {
				first = first.next;
			}

			while (first != null) {
				first = first.next;
				second = second.next;
			}

			second.next = second.next.next;
			return head.next;
		}
	}
}
