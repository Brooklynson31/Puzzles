package leetcode.linkedlists;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(3);
		ListNode C = new ListNode(4);
		ListNode D = new ListNode(1);
		ListNode E = new ListNode(6);
		ListNode F = new ListNode(1);
		ListNode G = new ListNode(1);

		

		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		F.next = G;
		
		A = reverseList(A);
		while(A != null){
			System.out.println("[" + A.val + "]");
			
			A = A.next;
		}
	}
	
//	public static ListNode reverseList(ListNode head) {
//       if(head == null || head.next == null){
//    	   return head;
//       }
//       ListNode prev = head.next;
//       ListNode curr = head;
//       prev = reverseList(prev);
//       prev.next = curr;
//		curr.next = null;
//		return prev.next;
//    }
	
	
	///Try figuring out using iterative and recursive solution
	//recursive
	//allows my to get to the last node and change it to point to the previous value
	//can then have previous value just point to null to avoid loop
	//Iterative
	//can traverse the list without affecting pointers
	public static ListNode reverseList(ListNode head) {
	       if(head == null || head.next == null){
	    	   return head;
	       }
	       ListNode next = head.next;
	       ListNode curr = head;
	       next = reverseList(next); // next will hold value of prev element after this line
	       head = next; 			//will hold value of new head returned
	       while(next.next != null){ //traverse reverse list to the end
	    	   next = next.next;
	    	}
	       curr.next = null; //set the previous node to point to null
	       next.next = curr;	//add to the end of the new list
			return(head.next == null) ? next: head; //checks if you are at the end of the original list
	    }

}
