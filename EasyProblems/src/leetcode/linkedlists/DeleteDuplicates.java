package leetcode.linkedlists;

public class DeleteDuplicates {

//	Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//	For example,
//	Given 1->1->2, return 1->2.
//	Given 1->1->2->3->3, return 1->2->3.
	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(1);
		ListNode C = new ListNode(1);

		A.next = B;
		B.next = C;
		
		deleteDuplicates(A);
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode curr = head;
		while(curr.next != null){
			int data = curr.val;
			if(data == curr.next.val){
				ListNode dups = curr;
				while(dups != null && data == dups.val){
					dups = dups.next;
				}
				curr.next = dups;
			} 
		if(curr.next == null){
			break;
		}else
		curr = curr.next;
			
		}
		return head;
    }

}
