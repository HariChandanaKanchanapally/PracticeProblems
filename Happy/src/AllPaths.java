import java.util.ArrayList;
import java.util.List;

/*
 * The problem finds all paths from root in a binary tree
 */
public class AllPaths {
	List<String> list = new ArrayList<String>();
	String str = "";  
	
	int[] arr = new int[20];
    public List<String> binaryTreePaths(TreeLinkNode root) {
    	 List<String> s = intermediate(root,arr, 0);
    	 return s;

    }

    public List<String> intermediate(TreeLinkNode root,int[] arr, int index) {
    
    	/*
    	 * Add the path value into the array 
    	 * At an instance, index of the node int he array is attained through its
    	 * height from root. 
    	 */
    	if (root!= null)
    		arr[index] = root.val;
    	
    	// Trace the array and add the string to the list on 
    	// reaching leaf node in every path
    	if(root.left == null && root.right == null) {
    		for(int i = 0;i<index;i++) 
    			str += arr[i]+"->";
    		str += arr[index];
    		list.add(str);
    		str = "";
    	}
    	// recurse left and right
    	else {
    		intermediate(root.left, arr,index+1);
    		intermediate(root.right,arr,index+1);
    	}
    	return list;
    	
    }
    public static void main(String args[]) {
		TreeLinkNode t = new TreeLinkNode(1);
		t.left = new TreeLinkNode(2);
		t.right = new TreeLinkNode(3);
		t.left.left = new TreeLinkNode(4);
		t.left.right = new TreeLinkNode(5);
		t.right.left = new TreeLinkNode(6);
		t.right.right = new TreeLinkNode(7);
		
		AllPaths ap = new AllPaths();
		List<String> str = ap.binaryTreePaths(t);
		System.out.println(str);
    	
    }
}
