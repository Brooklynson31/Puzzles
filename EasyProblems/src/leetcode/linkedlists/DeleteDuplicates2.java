package leetcode.linkedlists;

import java.util.Set;
import java.util.TreeSet;


public class DeleteDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(-3);
		ListNode B = new ListNode(-1);
		ListNode C = new ListNode(0);
		ListNode D = new ListNode(0);
		ListNode E = new ListNode(0);
		ListNode F = new ListNode(3);
		ListNode G = new ListNode(3);
		

		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		F.next = G;
		
		A = deleteDuplicates2(A);
		while(A != null){
			System.out.println("[" + A.val + "]");
			
			A = A.next;
		}
	}

	public static ListNode deleteDuplicates2(ListNode head) {
		if(head == null || head.next == null)
			return head;
		Set<Integer> set = new TreeSet<Integer>();
		int dup = -500;
		ListNode newlist = head;
		while(head != null){
			if(set.add(head.val) == false || head.val == dup){
				dup = head.val;
				set.remove(head.val);
			}
			
			
			head = head.next;
		}
		if(set.isEmpty()){
			return null;
		}
		else if(dup == -500){
			return newlist;
		}
		else{
			head = newlist.next;
			int k = 0;
			for(Integer a: set){
				newlist = newlist.next;

				newlist.val = a;
				k++;
			}
			newlist.next = null;
		}

	
		 return head; //next to compare two values of head .val and head.next.val
   }
}
