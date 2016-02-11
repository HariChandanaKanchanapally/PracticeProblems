package Tree;

import java.util.Stack;

public class PostOrderWithoutRecursion {
	
	public void postorder(TreeNode root) {
		Stack<TreeNode> st = new Stack<TreeNode>();
		
		while (root != null || !st.empty()) {
			
			if (root != null) {
				st.push(root);
				root = root.right;
			} else {
				root = st.peek();
				System.out.print(" "+st.pop().data);
				root = root.left;
			}
		}
	}
	public static void main(String args[]) {
		TreeNode root = new TreeNode();
	    PostOrderWithoutRecursion powr = new PostOrderWithoutRecursion();
		InOrderWithoutRecursion iowr = new InOrderWithoutRecursion(); 
		root = iowr.create(10);
		root.left = iowr.create(20);
		root.right = iowr.create(30);
		root.left.left = iowr.create(40);
		root.left.right = iowr.create(50);
		root.right.left = iowr.create(60);
		
		powr.postorder(root);
	}
}
