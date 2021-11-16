package jun.algorithm.hard.mergeksortedlist;

import java.util.PriorityQueue;

import jun.algorithm.easy.mergetwosortedlists.MergeTwoLists.ListNode;

public class MergeKSortedList {
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
	
	public static ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (ListNode head : lists) {
			while (head != null) {
				queue.add(head.val);
				head = head.next;
			}
		}
		
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		
		while(!queue.isEmpty()) {
			head.next = new ListNode(queue.remove());
			head = head.next;
		}
		
		return dummy.next;
	}

	public static void main(String[] args) {
		
	}
}
