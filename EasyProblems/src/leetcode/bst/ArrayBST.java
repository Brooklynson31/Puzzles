package leetcode.bst;


public class ArrayBST {

	public static void main(String[] args) {

		int[] nums = new int[] {0,1,2,3,4,5,6,7,8,9};
		TreeNode tree = sortedArrayToBST(nums);
		System.out.println(tree.val);
		}
	
	 public static TreeNode sortedArrayToBST(int[] nums) {
	     int size = nums.length/2;
		 TreeNode root = new TreeNode(nums[size]);  
		 for(int i = 0; i < nums.length; i++){
			 if(i == size)
				 continue;
			 else{
				 TreeNode temp = new TreeNode(i);
				 insert(root,temp);
			 }
			 
		 }
		 
		 
		 
		 return root;
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

}
