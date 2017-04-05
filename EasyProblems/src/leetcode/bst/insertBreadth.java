package leetcode.bst;

import java.util.LinkedList;
import java.util.Queue;

public class insertBreadth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static TreeNode insert(TreeNode head, TreeNode node){
		if(head == null){ //check to see if node we are at exists in the tree
			return node; //base case, if the head null then the node itself is head
		}				
										//compare the node we are inserting with the node we are at
		
		if(node.val <= head.val){ //if the node value is smaller than the head  then its correct place 
			TreeNode temp = head.left;							//is somewhere in the left subtree-we insert the node into the left subtree
			head.left = (insert(temp, node));
		} else {
			TreeNode temp = head.right;
			head.right = (insert(temp, node));
																//is somewhere in the right subtree. we insert the node into the left subtree
		}
			
			
			return head; //return the parent of the node we just inserted into the tree
		}
	
	public static void breadthFirst(TreeNode root){
		if(root == null) //null root indicates nothing to traverse
			return;
		
		
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);  //set up a queue and start by enqueueing the root node
		
		while(!queue.isEmpty()){ //As long as the queue is not empty, process the Node at the head of the queue
			TreeNode node = queue.remove();
			System.out.println(node.val);
			
			if(node.left != null){ // adding the left child first ensures that the nodes at the Same Level are processed from left to right
				queue.add(node.left); // adds left child to queue
			}
			if(node.right != null){ //make sure it is not null
				queue.add(node.right);//adds right child to queue
			}
		}
		
	}
}
