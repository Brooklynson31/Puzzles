package leetcode.bst;

public class BalancedBinary {

	public static void main(String[] args) {

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		
		a.left = b;
//		a.right = c;
//		c.right = b;
		//b.left = d;
		//d.left = e;
		
		System.out.println(isBalanced(a));
	}
	
//	 public static boolean isBalanced(TreeNode root) {
//	     if(root == null) return true;   
//		 
//	    int leftSub = maxDepth(root.left);
//	    int rightSub = maxDepth(root.right);
//	   
//	     int a = Math.abs(leftSub)-Math.abs(rightSub);
//	     int b = Math.abs(rightSub)-Math.abs(leftSub);
//	   return (a == 0 || a == 1)|| b==a ;
//	   }
//	 
//	 public static int maxDepth(TreeNode root){
//		 if(root == null) return Integer.MIN_VALUE;
//		 
//		 if(root.left == null && root.right == null)
//			 return 0;
//		 int maxLeft = 1+maxDepth(root.left);
//		 int maxRight = 1+maxDepth(root.right);
//		 
//		 if(maxLeft - maxRight > 1 || maxRight -maxLeft > 1){
//			 return Integer.MAX_VALUE-1;
//		 }
//		 
//		 return Math.max(maxLeft, maxRight);
//	 }
	
	public static boolean isBalanced(TreeNode root) {
	    if(root==null){
	        return true;
	    }
	    return height(root)!=-1;
	    
	}
	public static int height(TreeNode node){
	    if(node==null){
	        return 0;
	    }
	    int lH=height(node.left);
	    if(lH==-1){
	        return -1;
	    }
	    int rH=height(node.right);
	    if(rH==-1){
	        return -1;
	    }
	    if(lH-rH<-1 || lH-rH>1){
	        return -1;
	    }
	    return Math.max(lH,rH)+1;
	}
	

}
