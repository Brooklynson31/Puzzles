package leetcode.linkedlists;

public class RemoveLinkedListElements {
	
//	Remove all elements from a linked list of integers that have value val.
//
//	Example
//	Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
//	Return: 1 --> 2 --> 3 --> 4 --> 5

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(1);
		ListNode C = new ListNode(1);
		ListNode D = new ListNode(3);
		ListNode E = new ListNode(4);
		ListNode F = new ListNode(1);
		ListNode G = new ListNode(6);

		

//		A.next = B;
////		B.next = C;
////		C.next = D;
////		D.next = E;
////		E.next = F;
////		F.next = G;
		
		A = removeElements(A, 2);
		while(A != null){
			System.out.println("[" + A.val + "]");
			
			A = A.next;
		}
	}
	
	
	   public static ListNode removeElements(ListNode head, int val) {
		   if (head == null) 
			   return null;
	        head.next = removeElements(head.next, val);
	        
	        return head.val == val ? head.next : head;
		   	
	    }
	

}
