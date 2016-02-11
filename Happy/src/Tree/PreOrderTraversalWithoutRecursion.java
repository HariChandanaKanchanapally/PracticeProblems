package Tree;

import java.util.Stack;

public class PreOrderTraversalWithoutRecursion {
	public void preorder(TreeNode root) {
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(root);
		while (!st.empty()) {
			root = st.pop();
			System.out.print(root.data+" ");
			if (root.right != null) st.push(root.right);
			if (root.left != null) st.push(root.left);
		}
	}
	public static void main(String args[]) {
		PreOrderTraversalWithoutRecursion pwr = new PreOrderTraversalWithoutRecursion();
		InOrderWithoutRecursion iowr = new InOrderWithoutRecursion(); 
		
		TreeNode root = new TreeNode();
		root = iowr.create(10);
		root.left = iowr.create(20);
		root.right = iowr.create(30);
		root.left.left = iowr.create(40);
		root.left.right = iowr.create(50);
		root.right.left = iowr.create(60);
		
		pwr.preorder(root);
		
	}
}
