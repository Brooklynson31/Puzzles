package leetcode.linkedlists;

import java.util.Stack;

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
	

	
	
	//to make faster and remove while loop, try adding another pointer to make list faster
	//have head be value returned by  recursive call
	//figure out a way to change pointers without traversing
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
	
	
//	public static ListNode reverseList(ListNode head) {
//	       if(head == null || head.next == null){
//	    	   return head;
//	       }
//	       Stack<ListNode> stack = new Stack<ListNode> ();
//	       ListNode curr = head;
//	       while(curr != null){ 
//	    	   stack.push(curr);
//	    	   curr = curr.next;
//	    	}
//	       head = stack.pop();
//	       head.next = null;
//	       curr = head;
//	       
//	       while(!stack.isEmpty()){
//	    	   ListNode reverse = stack.pop();
//	    	   reverse.next = null;
//	    	   curr.next = reverse;
//	    	   curr = curr.next;
//	       }
//			return head; 
//	    }

}
