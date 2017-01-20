package leetcode.linkedlists;

public class MergeSortedLists {
	//Merge two sorted linked lists and return it as a new list. 
	//The new list should be made by splicing together the nodes of the first two lists.



	public static void main(String[] args) {
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
//		ListNode C = new ListNode(4);
//		ListNode D = new ListNode(1);
//		ListNode E = new ListNode(6);
//		ListNode F = new ListNode(1);
//		ListNode G = new ListNode(1);

		

//		A.next = B;
//		B.next = C;
//		C.next = D;
//		D.next = E;
//		E.next = F;
//		F.next = G;
		
		A = mergeTwoLists(A,B);
		while(A != null){
			System.out.println("[" + A.val + "]");
			
			A = A.next;
		}

	}
	public	static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		ListNode newHead = null;
		if(l1.val < l2.val){
			newHead = l1;
			l1 = l1.next;

		} else {
			newHead = l2;
			l2 = l2.next;

		}
	
		ListNode curr = newHead;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				curr.next = l1;
				l1 = l1.next;
			} else {
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		if(l1 != null){
			while(l1 != null){
				curr.next = l1;
				curr = curr.next;
				l1 = l1.next;
			}
		} else {
			while(l2 != null){
				curr.next = l2;
				curr = curr.next;
				l2 = l2.next;
			}
			
		}
		
		
        return newHead;
    }

}
