package ds.BinaryTree;

public class BinaryTreeImplementation {
	
	static class Node{
		int data;
		Node left, right;
		
		public Node(int key) {
			data = key;
			left=right=null;
		}
	}
	
	Node root;
	
	public BinaryTreeImplementation() {
		root = null;
	}
	
	void inOrder(Node node) {
		
		if(node==null) return;
		
		inOrder(node.left);
		System.out.println(node.data + " ");
		inOrder(node.right);
		
	}
	
	void postOrder(Node node) {
		if(node==null) return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data+ " ");
	}
	
	void preOrder(Node node) {
		if(node==null) return;
		
		System.out.println(node.data+ " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	void preOrder() {
		preOrder(root);
	}
	
	void postOrder() {
		postOrder(root);
	}
	
	void inOrder() {
		inOrder(root);
	}
	
	public static void main(String[] args) {
		
		BinaryTreeImplementation tree = new BinaryTreeImplementation();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(9);
		
		System.out.println("---InOrder Traversal---");
		tree.inOrder();
		System.out.println();
		System.out.println("---postOrder Traversal---");
		tree.postOrder();
		System.out.println();
		System.out.println("---preOrder Traversal---");
		tree.preOrder();
	}

}
