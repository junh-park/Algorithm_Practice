package jun.algorithm.graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DFS {
	static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}

		public static int printNode(Node node) {
			System.out.println(node.getVal());
			return node.getVal();
		}

		public int getVal() {
			return this.val;
		}
	}

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(200,100, 80, 50, 90, 30, 60, 95, 85, 120, 110, 108, 115, 140, 160);

		Node root = createTree(data);
		System.out.println(root.val);
//		inOrderPrint(root);
//		preOrderPrint(root);
//		postOrderPrint(root);
		
		PriorityQueue<Object> que= new PriorityQueue<>();
		
		que.add("1");
		que.add("2");

		
	}
	
	public static void inOrderPrint(Node root) {
		if (root == null)
			return;

		inOrderPrint(root.left);
		System.out.println(root.val);
		inOrderPrint(root.right);
	}

	private static void postOrderPrint(Node root) {
		if (root == null)
			return;

		postOrderPrint(root.left);
		postOrderPrint(root.right);		
		System.out.println(root.val);
	}

	private static void preOrderPrint(Node root) {
		if (root == null)
			return;

		preOrderPrint(root.left);
		preOrderPrint(root.right);		
		System.out.println(root.val);
	}

	public static Node createTree(List<Integer> data) {
		Node root = null;

		for (Integer value : data) {
			root = insertNode(root, value);
		}

		return root;
	}

	public static Node insertNode(Node head, int value) {
		if (head == null) {
			return new Node(value);
		}

		if (head.val < value) {
			head.right = insertNode(head.right, value);
		} else {
			head.left = insertNode(head.left, value);
		}

		return head;
	}

	public static void printLeaves(Node root) {
		if (root.left == null && root.right == null)
			System.out.println(root.val);

		if (root.left != null)
			printLeaves(root.left);
		if (root.right != null)
			printLeaves(root.right);
	}


}
