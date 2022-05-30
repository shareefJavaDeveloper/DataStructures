package ds.BinaryTree;

public class BinaryTreeImplRunTime {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			left= right = null;
		}
	}
	
	Node root;
	
	public BinaryTreeImplRunTime() {
		root = null;
	}
	
	public Node addRecursive(Node current,int value) {
		
		if(current==null) {
			return new Node(value);
		}
		
		if(value<current.data) {
			current.left = addRecursive(current.left, value);
		}
		else if( value>current.data ) {
			current.right = addRecursive(current.right, value);
		}else
			return current;
		
		return current;
		
	}
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	public void inOrder(Node node) {
		if(node == null) return;
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public static void main(String[] args) {
		BinaryTreeImplRunTime tree = new BinaryTreeImplRunTime();
		
		tree.add(10);
		tree.add(8);
		tree.add(12);
		tree.add(6);
		tree.add(9);
		
		tree.inOrder();
	}

}
