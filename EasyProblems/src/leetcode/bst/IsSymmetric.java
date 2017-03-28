package leetcode.bst;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(3);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(3);
		TreeNode g = new TreeNode(4);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = g;
		c.right = f;
		
		a.left = b;
		a.right = c;
		b.right = d;
		c.right = f;
		
		System.out.println(isSymmetric(a));
		
		
	}
	

	
	//actually use breadth first search(use a queue to figure out solution)
	
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        if(root.left == null && root.right == null)
        return true;
		
        Queue<TreeNode> leftsub = new LinkedList<TreeNode>();	
        Queue<TreeNode> rightsub = new LinkedList<TreeNode>();
        
        leftsub.add(root.left);
        rightsub.add(root.right);

        while(!leftsub.isEmpty() && !rightsub.isEmpty()){
        	TreeNode left = leftsub.remove();
        	TreeNode right = rightsub.remove();
        	
        	if(left == null || right == null)
        		return false;
        	
        	
        	if(left.left != null && right.right != null){
        		leftsub.add(left.left);
        		rightsub.add(right.right);
        	} else if ((left.left != null && right.right == null )|| (left.left == null && right.right != null)){
        		return false;
        	}
        	if(left.right != null && right.left != null){
        		leftsub.add(left.right);
        		rightsub.add(right.left);
        	}
        	else if((left.right == null && right.left != null ) || (left.right != null && right.left == null)){
        		return false;
        	}
        	
        	if(left.val != right.val){
        		return false;
        	}
        	
 
        	
        	
        }
		
		return true;
    }



}
