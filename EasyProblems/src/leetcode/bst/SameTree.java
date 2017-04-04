package leetcode.bst;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

	public static void main(String[] args) {

		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(7);
		TreeNode h = new TreeNode(8);
		
		TreeNode aa = new TreeNode(1);
		TreeNode bb = new TreeNode(2);
		TreeNode cc = new TreeNode(3);
		TreeNode dd = new TreeNode(4);
		TreeNode ee = new TreeNode(5);
		TreeNode ff = new TreeNode(6);
		TreeNode gg = new TreeNode(7);
		TreeNode hh = new TreeNode(8);
		
		a.left = b;
		a.right = c;
		b.left = d;
		d.left = e;
		e.left = f;
		f.left = g;
		g.left = h;	
		
		aa.left = bb;
		aa.right = cc;
		bb.left = dd;
		dd.left = ee;
		ee.left = ff;
		ff.left = gg;
		gg.left = hh;
		System.out.println(isSameTree(a,aa));
	}
	
	//put in leetcode and see results
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
	     if(p == null && q != null) return false;
	     if(q == null && p != null) return false;
	     if(p == null && q == null) return true;
	     
	     Queue<TreeNode> queueA = new LinkedList<TreeNode>();
	     Queue<TreeNode> queueB = new LinkedList<TreeNode>();
	     
	     List<Integer> listA = new ArrayList<Integer>();
	     List<Integer> listB = new ArrayList<Integer>();
	     
	    
	     queueA.add(p);
	     queueB.add(q);
	    
	     
	     while(!queueA.isEmpty() && !queueB.isEmpty()){

	    	 TreeNode tempA = queueA.remove();
	    	 TreeNode tempB = queueB.remove();
	    	 if(tempA == null || tempB == null)
	    		 return false;
	    	 
	    	 listA.add(tempA.val);
	    	 listB.add(tempB.val);
	    	 
	    	 if(tempA.left != null || tempB.left != null){
	    		TreeNode temp = tempA.left;
	    		TreeNode temp1 = tempB.left;
	    		
	    		queueA.add(temp);
	    		queueB.add(temp1);
	    		 
	    	 }
	    	 
	    	 if(tempA.right != null || tempB.right != null){
	    		 TreeNode temp = tempA.right;
	    		 TreeNode temp1 = tempB.right;
	    	
	    		 queueA.add(temp);
	    		 queueB.add(temp1);
	    	 }
	    	 
	     }
	     
	     	return listA.equals(listB);
	    }

}
