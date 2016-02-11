package Tree;

import java.util.Stack;

public class InOrderWithoutRecursion {
	
	public TreeNode root;
	
	public InOrderWithoutRecursion() {
		
	}
	public TreeNode create(int ele) {
		root = new TreeNode();
		root.data = ele;
		root.left = null;
		root.right = null;
		return root;
	}
	
	public void inorder(TreeNode root) {
		Stack<TreeNode> st = new Stack<TreeNode>();
		
	    // Enter the loop if you have nodes in tree or some nodes in stack
		while ( root != null || !st.empty()) {
			
			// You are here because the current root is not null 
			// there may be a left node attached to it
			if (root != null) {
				st.push(root); 
				root = root.left;
			}

			// You are here because your current node doesnt have left nodes
			// but may have right nodes
			// if a current node doesnt have left or right nodes 
			// (leaf node) root is null and we peek for the next node on stack
			else {
				root = st.peek();
				System.out.print(st.pop().data+" ");
				root = root.right;
			}
		}
	}
	
	public static void main(String args[]) {
		InOrderWithoutRecursion iowr = new InOrderWithoutRecursion();
		
		TreeNode root = new TreeNode();
		root = iowr.create(10);
		root.left = iowr.create(20);
		root.right = iowr.create(30);
		root.left.left = iowr.create(40);
		root.left.right = iowr.create(50);
		root.right.left = iowr.create(60);
		
		iowr.inorder(root);
		
		
	}
}
