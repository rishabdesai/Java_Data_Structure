package BST;

class BinarySearchTree {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			this.data = 0;
			this.left = null;
			this.right = null;
		}

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	private Node root;

	public BinarySearchTree() {
		this.root = null;
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

//	private void addRecursive(Node trav, int val) {
//		if (val < trav.data) {
//			if (trav.left == null)
//				trav.left = new Node(val);
//			else
//				addRecursive(trav.left, val);
//		} else {
//			if (trav.right == null)
//				trav.right = new Node(val);
//			else
//				addRecursive(trav.right, val);
//		}
//
//	}
//
//	public void addRecursive(int val) {
//		if (root == null)
//			root = new Node(val);
//		else
//			addRecursive(root, val);
//	}

	private void recPreOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		recPreOrder(trav.left);
		recPreOrder(trav.right);

	}

	public void recPreOrder() {
		System.out.print("pre-order values : ");
		recPreOrder(root);
	}
	
	private void recInOrder(Node trav) {
		if (trav == null)
			return;
		
		recInOrder(trav.left);
		System.out.print(trav.data + " ");
		recInOrder(trav.right);
	}

	public void recInOrder() {
		System.out.print("In-order values : ");
		recInOrder(root);
	}
	
	private void recPostOrder(Node trav) {
		if (trav == null)
			return;
		
		recPostOrder(trav.left);
		recPostOrder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void recPostOrder() {
		System.out.print("Post-order values : ");
		recPostOrder(root);
	}


}

public class BSTmain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(90);
		bst.add(100);
		bst.add(40);
		bst.add(70);
		bst.add(80);
		bst.add(20);
		bst.add(60);
		
		bst.recPreOrder();  	// 50 30 10 20 40 90 70 60 80 10
		System.out.println();
		bst.recInOrder(); 		// 10 20 30 40 50 60 70 80 90 100 
		System.out.println();
		bst.recPostOrder(); 	// 20 10 40 30 60 80 70 100 90 50
	}
}
