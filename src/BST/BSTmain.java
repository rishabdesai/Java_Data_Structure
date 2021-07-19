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

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

//1. Add Values to BST	(using non-recursion)
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

	//1a. Add Values to BST	(using recursion)	
/*	private void addRecursive(Node trav, int val) {
		if (val < trav.data) {
			if (trav.left == null)
				trav.left = new Node(val);
			else
				addRecursive(trav.left, val);
		} else {
			if (trav.right == null)
				trav.right = new Node(val);
			else
				addRecursive(trav.right, val);
		}
	}

	public void addRecursive(int val) {
		if (root == null)
			root = new Node(val);
		else
			addRecursive(root, val);
	} */

//2. find recursive preOrder, inOrder, postOrder
	//recursive preorder
	private void recPreOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		recPreOrder(trav.left);
		recPreOrder(trav.right);

	}

	public void recPreOrder() {
		System.out.println();
		System.out.print("pre-order values : ");
		recPreOrder(root);
	}

	//recursive inorder
	private void recInOrder(Node trav) {
		if (trav == null)
			return;

		recInOrder(trav.left);
		System.out.print(trav.data + " ");
		recInOrder(trav.right);
	}

	public void recInOrder() {
		System.out.println();
		System.out.print("In-order values : ");
		recInOrder(root);
	}

	//recursive postorder
	private void recPostOrder(Node trav) {
		if (trav == null)
			return;

		recPostOrder(trav.left);
		recPostOrder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void recPostOrder() {
		System.out.println();
		System.out.print("Post-order values : ");
		recPostOrder(root);
	}

//3. find height of a tree
	private int recHeight(Node trav) {
		if (trav == null)
			return -1;
		int htLeft = recHeight(trav.left);
		int htRight = recHeight(trav.right);
		int max = Integer.max(htLeft, htRight);
		return max + 1;
	}

	public int recHeight() {
		return recHeight(root);
	}

//4. search element ( using recursion)
	private Node recSearch(Node trav, int val) {
		if (trav == null)
			return null;
		if (val == trav.data)
			return trav;
		if (val < trav.data)
			return recSearch(trav.left, val);
		else
			return recSearch(trav.right, val);
	}

	public Node recSearch(int val) {
		return recSearch(root, val);
	} 

//4a. search element (using non-recursive)
/*	public Node find(int val) {
		Node trav = root;
		while (trav != null) {
			if (val == trav.data)
				return trav;
			if (val < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return null;
	} */

//5. Delete Tree
	private void delTree(Node trav) {
		if (trav == null)
			return;
		delTree(trav.left);
		trav.left = null;
		delTree(trav.right);
		trav.right = null;
	}

	public void delTree() {
		delTree(root);
		root = null;
	}
}

public class BSTmain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
//1. Add values to BST
		bst.add(50);
		bst.add(30);
		bst.add(70);
		bst.add(20);
		bst.add(40);
		bst.add(60);
		bst.add(80);

//2. find recursive preOrder, inOrder, postOrder
		bst.recPreOrder(); // 50 30 20 40 70 60 80
		bst.recInOrder(); // 20 30 40 50 60 70 80
		bst.recPostOrder(); // 20 40 30 60 80 70 50
		System.out.println();
		
//3. find height of a tree
		System.out.println("--------------------");
		System.out.println("height of a tree : " + bst.recHeight());

//4. search element ( using recursion)
		System.out.println("--------------------");
		BinarySearchTree.Node temp = bst.recSearch(80);
		if (temp == null)
			System.out.println("not found");
		else
			System.out.println(" found " + temp);

//5. delete tree
		System.out.println("--------------------");
		System.out.println("after deleting tree : ");
		bst.delTree();
		bst.recPreOrder(); 
		bst.recInOrder(); 
		bst.recPostOrder(); 

	}
}
