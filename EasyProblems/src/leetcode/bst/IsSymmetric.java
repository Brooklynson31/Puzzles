package leetcode.bst;


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
		
		System.out.println(isSymmetric2(a));
		
		
	}
	
	public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
		
        isSymmetric(root.left);
        isSymmetric(root.right);
		
		return (root.left == root.right) ?true  : false;
    }
	
	public static boolean isSymmetric2(TreeNode root) {
        if(root == null) return true;
		
        TreeNode left = subleft(root.left);
        TreeNode right = root.right;
       
		
		return (left == right) ?true  : false;
    }
	
	//actually use breadth first search(use a queue to figure out solution)
	
	public static TreeNode subright(TreeNode head) {
		TreeNode temp = head.right;
		head.right = head.left;
		head.left = temp;
	
		
		return head;
	}

	public static TreeNode subleft(TreeNode head){
		TreeNode temp = head.left;
		head.left = head.right;
		head.right = temp;
	
		return head;
	}

}
