package leetcode.linkedlists;

public class AddTwoNumbers {
//	You are given two non-empty linked lists representing two non-negative integers. 
//	The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//	You may assume the two numbers do not contain any leading zero, except the number 0 itself.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		  int l1count = 1;
		  int l2count = 1;
		  
		  ListNode temp = l1;
		  ListNode temp2 = l2;
		  while(temp.next != null){
			  l1count++;
			  temp = temp.next;
		  }
		  
		  temp = l2;
		  while(temp.next != null){
			  l2count++;
			  temp = temp.next;
		  }	  
		  
		  temp = new ListNode(0);
		  
		  return null;
	    }

}
