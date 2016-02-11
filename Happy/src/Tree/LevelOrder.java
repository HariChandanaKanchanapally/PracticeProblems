package Tree;

public class LevelOrder {
	public int height(TreeNode root,int ht) {
		int leftheight = 0;
		int rightheight = 0;
		if (root == null)
			return ht;
		
		leftheight = height(root.left,ht+1);
		rightheight = height(root.right,ht+1);
		
		if (leftheight > rightheight)
			return leftheight;
		else
			return rightheight;		
	}
	public void levelorder(TreeNode root) {
		int ht = height(root,0);
		for (int i=0;i<ht;i++) {
			lo(root, i,0);
			System.out.print("\n");
		}
	}
	public void lo(TreeNode root , int level, int height) {
		if (root != null && level == height) {
			System.out.print(root.data+" ");
			return;
		}
		
		if (root.left != null)
		lo(root.left, level-1,height);
		if (root.right!=null)
		lo(root.right,level-1,height);
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
		
		LevelOrder n = new LevelOrder();
		
		n.levelorder(root);
		
	}
}
