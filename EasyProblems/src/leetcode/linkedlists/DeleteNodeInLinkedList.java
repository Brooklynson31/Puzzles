package leetcode.linkedlists;

public class DeleteNodeInLinkedList {
//	Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
//
//	Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		
		a.next = b;
		b.next = c;
		c.next = d;
	}
	
	 public void deleteNode(ListNode node) {
		 node.val = node.next.val;
		 node.next = node.next.next;
	    }


}


