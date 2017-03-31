package leetcode.bst;

import java.util.LinkedList;
import java.util.Queue;



public class MinDepth {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(7);
		TreeNode h = new TreeNode(8);

	


		
//		a.left = b; // =2
//		a.right = c;
//		b.left = d;
//		b.right = e;
		
//		a.left = b;  //=5
//		b.left = c;
//		c.left = d;
//		d.left = e;
		
//		a.right = b; // =5
//		b.right = c; //check out why single sided trees might be an edge case
//		c.right = d;
//		d.right = e;

	//[1,2,3,4,null,null,null,5,null,6,null,7,null,8] = 2
//		a.left = b;
//		a.right = c;
//		b.left = d;
//		d.left = e;
//		e.left = f;
//		f.left = g;
//		g.left = h;
		
//		a.right = b;
//		a.left = c;
//		b.right = d;
//		d.right = e;
//		e.right = f;
//		f.right = g;
//		g.right = h;

		//[1,2,3]	=2
a.left = b;
a.right = c;
		
		System.out.println(minDepth(a));
		
		
	}
	
//	public static int minDepth(TreeNode root) {
//		if(root == null) return 0;
//		
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//		queue.add(root);  
//		int count = 1;
//		int lcount = 0;
//		int rcount = 0;
//		while(!queue.isEmpty()){ 
//			TreeNode node = queue.remove();
//
//			
//			if(node.left == null && node.right ==null)
//					break;
//			count++;
//
//			
//			
//				if(node.left != null){ 
//					queue.add(node.left); 
//					lcount++;
//				}
//				
//				if(node.right != null){ 
//					queue.add(node.right);
//					rcount++;
//				}
//			
//		}
//
////need some check for lcount and rcount
////		if(lcount == count || rcount == count)
////			count++;
//		
//		 return count;
//}
	
	public static int minDepth(TreeNode root){
	    if(root == null){
	        return 0;
	    }
	    return helper(root);
	}
	public static int helper(TreeNode root) {
		if(root == null) return Integer.MAX_VALUE; //base case, if the root is null then the tree has no nodes, the max depth is 0
		
		if(root.left== null && root.right == null){ //if both the left and right child of the node is null
			return 1;										//then this is a leaf and has a depth of 0
		}
		
		int leftMaxDepth = helper(root.left); //Find the max depth on the left and right subtrees
		int rightMaxDepth = helper(root.right); //add 1 to account for the current tree depth of the tree
		
		return Math.min(leftMaxDepth, rightMaxDepth)+1; //f
}
}
