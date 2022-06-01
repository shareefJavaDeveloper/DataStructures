package ds.BinaryTree;

public class FindKthElementOfBST {
	
	class Node{
		int data;
		Node left,right;
		public Node(int data){
				this.data = data;
				this.left=null;
				this.right=null;
		}
	}
	
	Node root;
	
	public FindKthElementOfBST() {
		root=null;
	}

	public static void main(String[] args) {
		
		int array[] = {22,18,14,25,23,32,28,26,40};
		
		FindKthElementOfBST bst = new FindKthElementOfBST();
		
		for (int i : array) {
			bst.add(i);
		}
		int k = 5;
		bst.KthLargestElement(k);
	}

	public void KthLargestElement(int k) {
		
		 KthLargestElement(root,k);
		
	}
	int count = 0;
	private void KthLargestElement(Node root,int k) {
		if(root==null) {
			return ;
		}
		KthLargestElement(root.right,k);
		count++;
		if (count==k) {
			System.out.println(root.data);
		}
		KthLargestElement(root.left, k);
		
		
	}

	private void add(int value) {
		root = addRecursive(root,value);
		
	}

	private Node addRecursive(Node curr, int value) {
		
		if (curr==null) {
			return new Node(value);
		}
		if(value<curr.data) {
			curr.left=addRecursive(curr.left, value);
		}
		else if(value>curr.data){
			curr.right=addRecursive(curr.right, value);
		}
		else
			return curr;
		
		
		return curr;
	}

}
