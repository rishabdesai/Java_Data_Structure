//DFS (Depth First Search) for Tree

package tree;

import java.util.Stack;

public class DepthFirstSearchBST {
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

	public DepthFirstSearchBST() {
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

	public void depthFirstSearch() {
		System.out.print("DFS   :   ");
		Stack<Node> s = new Stack<>();
		s.push(root);

		while (!s.isEmpty()) {
			Node trav = s.pop();
			System.out.print(trav.data + ", ");
			if (trav.right != null)
				s.push(trav.right);
			if (trav.left != null)
				s.push(trav.left);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DepthFirstSearchBST dfs = new DepthFirstSearchBST();
		dfs.add(50);
		dfs.add(30);
		dfs.add(70);
		dfs.add(20);
		dfs.add(40);
		dfs.add(60);
		dfs.add(80);

		dfs.depthFirstSearch();
		System.out.println();
	}
}
