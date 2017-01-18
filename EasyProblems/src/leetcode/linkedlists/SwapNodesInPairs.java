package leetcode.linkedlists;

public class SwapNodesInPairs {
//	Given a linked list, swap every two adjacent nodes and return its head.
//
//			For example,
//			Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//			Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

	public static void main(String[] args) {

		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(2);


		A.next = B;
//		B.next = C;
//		C.next = D;
		
		swapPairs(A);
	}
	
	  public static ListNode swapPairs(ListNode head) {
		  if(head == null || head.next == null){
			  return head;
		  }
	      ListNode list = head;
	      int count = 1;
	      while(list != null){
	    	  if(list.next == null)
	    		  break;
	    	  if(count % 2 == 1){
	    		  int data = list.val;
	    		  int data2 = list.next.val;
	    		  list.val = data2;
	    		  list.next.val = data;
	    	  }
	    	  count++;
	    	  list = list.next;
	      }
		  
		  
		  return head;
	    }

}
