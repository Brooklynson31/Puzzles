package leetcode.bst;

import java.util.LinkedList;
import java.util.Queue;


public class ArrayBST {

	public static void main(String[] args) {

		int[] nums = new int[] {1,3};
		TreeNode tree = sortedArrayToBST(nums);
		breadthFirst(tree);
		}
	
	//Personal Solution --> doesnt pass all test cases
	 public static TreeNode sortedArrayToBST(int[] nums) {
		 if(nums.length == 0) return null;
		 if(nums.length == 1) return new TreeNode(nums[0]);
		 if(nums.length == 2){
			 TreeNode root = new TreeNode(nums[1]);
			 TreeNode leftsub = new TreeNode(nums[0]);
			 insert(root,leftsub);
			 return root;
		 }
			 
		
	     int size = nums.length/2;
		 int rootval = getMiddle(nums, 0,nums.length); 
		 int left = getMiddle(nums, 0, size);
		 int right = getMiddle(nums,size,nums.length);
		 TreeNode root = new TreeNode(rootval);
		 TreeNode leftsub = new TreeNode(left);
		 TreeNode rightsub = new TreeNode(right);
		 
		 insert(root,leftsub);
		 insert(root,rightsub);
		 for(int i = 0; i < nums.length; i++){
			 if((nums[i] == rootval) || (nums[i]==leftsub.val) || (nums[i] == rightsub.val))
				 continue;
			 else{
				 TreeNode temp = new TreeNode(nums[i]);
				 insert(root,temp);
			 }
			 
		 }
		 
		 
		 
		 return root;
	    }
	 
	 public static int getMiddle(int[] nums, int start, int end){
			
			int mid = (start+ end)/2;
			
			return nums[mid];
		}
	 
		
		
		public TreeNode sortedArrayBST(int[] num) {
		    if (num.length == 0) {
		        return null;
		    }
		    TreeNode head = helper(num, 0, num.length - 1);
		    return head;
		}

		public TreeNode helper(int[] num, int low, int high) {
		    if (low > high) { // Done
		        return null;
		    }
		    int mid = (low + high) / 2;
		    TreeNode node = new TreeNode(num[mid]);
		    node.left = helper(num, low, mid - 1);
		    node.right = helper(num, mid + 1, high);
		    return node;
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
