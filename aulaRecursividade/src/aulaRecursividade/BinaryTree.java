package aulaRecursividade;

public class BinaryTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	private void printPreOrder() {
		// printPreOrder(root);
		root.printPreOrder();
	}
	
	private Node find(int key) {
		return find(root, key);
	}

	private Node find(Node node, int key) {
		if (node != null) {
			if (key == node.getKey())
				return node;
			if (key < node.getKey())
				return find(node.getLeft(),key);
			return find(node.getRight(), key); 
		}
		return null;
	}

	private void printPreOrder(Node node) {
		System.out.print(node.getKey() + " ");
		if (node.getLeft() != null)
			printPreOrder(node.getLeft());
		if (node.getRight() != null)
			printPreOrder(node.getRight());
	}

	public void printInOrder() {
		// printInOrder(root);
		root.printInOrder();
	}

	public void printPosOrder() {
		root.printPosOrder();
	}

	private void printInOrder(Node node) {
		if (node.getLeft() != null)
			printInOrder(node.getLeft());
		System.out.print(node.getKey() + " ");
		if (node.getRight() != null)
			printInOrder(node.getRight());
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.add(10);
		tree.add(5);
		tree.add(2);
		tree.add(7);
		tree.add(6);
		tree.add(20);
		tree.add(15);
		tree.add(21);

		tree.printPreOrder();
		System.out.println();
		tree.printInOrder();
		System.out.println();
		tree.printPosOrder();
	}

	private void add(int key) {
		if (root == null)
			root = new Node(key);
		else
			root.add(key);
	}

}
