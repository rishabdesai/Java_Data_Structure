//DFS (Depth First Search) for Tree

package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchBST {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BreadthFirstSearchBST() {
		root = null;
	}

	public void add(int val) {
		Node nn = new Node(val);
		if (root == null)
			root = nn;
		else {
			Node trav = root;
			while (true) {
				if (val < trav.data) {
					if (trav.left == null) {
						trav.left = nn;
						break;
					} else
						trav = trav.left;
				} else {
					if (trav.right == null) {
						trav.right = nn;
						break;
					} else
						trav = trav.right;
				}
			}
		}
	}

	public void breadthFirstSearch() {
		System.out.print("DFS   :   ");
		Queue<Node> s = new LinkedList<>();
		s.offer(root);

		while (!s.isEmpty()) {
			Node trav = s.poll();
			System.out.print(trav.data + ", ");
			if (trav.left != null)
				s.offer(trav.left);
			if (trav.right != null)
				s.offer(trav.right);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BreadthFirstSearchBST dfs = new BreadthFirstSearchBST();
		dfs.add(50);
		dfs.add(30);
		dfs.add(70);
		dfs.add(20);
		dfs.add(40);
		dfs.add(60);
		dfs.add(80);

		dfs.breadthFirstSearch();
		System.out.println();
	}
}
