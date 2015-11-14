package aulaRecursividade;

public class Node {
	
	private int key;
	private Node left;
	private Node right;
	
	public Node(int key) {
		this.key = key;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getKey() {
		return key;
	}

	public void printPreOrder() {
		System.out.print(key + " ");
		if (left != null)
			left.printPreOrder();
		if (right != null)
			right.printPreOrder();
	}

	public void printInOrder() {
		if (left != null)
			left.printInOrder();
		System.out.print(getKey() + " ");
		if (getRight() != null)
			right.printInOrder();
		
	}

	public void printPosOrder() {
		if (left != null)
			left.printPosOrder();
		if (getRight() != null)
			right.printPosOrder();
		System.out.print(getKey() + " ");
	}

	public void add(int value) {
		if (value < key) {
			if (left == null)
				left = new Node(value);
			else
				left.add(value);
		} else {
			if (right == null)
				right = new Node(value);
			else 
				right.add(value);
		}
	}

}
