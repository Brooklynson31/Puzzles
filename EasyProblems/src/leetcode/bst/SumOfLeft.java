package leetcode.bst;

public class SumOfLeft {
	
	
	public static void main(String[] args) {

		TreeNode a = new TreeNode(3);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(20);
		TreeNode d = new TreeNode(15);
		TreeNode e = new TreeNode(7);
		TreeNode f = new TreeNode(10);
		TreeNode g = new TreeNode(10);
		TreeNode h = new TreeNode(10);
		
		a.left = b;
		a.right = c;
		c.right = e;
		c.left = d;
		
		b.left = f;
		b.right = new TreeNode(5);
		e.left = g;
		d.left = h;
		
		System.out.println(sumOfLeftLeaves(a));
	}
	
	public static int sumOfLeftLeaves(TreeNode root) {
		if(root == null) return 0;
      
		
		return helper(root,0);
    }
//	public static int helper(TreeNode root,int total){
//		if(root == null) return 0;
//		
//
//		
//		total = helper(root.left,total);
//		total += helper(root.right,total);
//
//		if(root.left != null){
//			total += root.left.val;
//		
//		}
//			return total;
//	}
	
	public static int helper(TreeNode root,int total){
		if(root == null) return 0;
		
		int leftleft = helper(root.left,total);
		if(leftleft != 0){
			total += leftleft;
		}
		int temp = helper(root.right,leftleft);
		if(temp > 0){
			
			return leftleft;
		}
		
		if(root.left == null && root.right ==null){
			return root.val;
		}


		
		
		
		return total;
	}
	

}
