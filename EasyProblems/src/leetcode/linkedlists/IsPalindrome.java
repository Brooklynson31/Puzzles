package leetcode.linkedlists;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(0);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(0);
		ListNode F = new ListNode(1);

		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		
		System.out.println(isPalindrome(A));

	}
	
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null){
			return true;
		}
		
     List<String> list = new ArrayList<String>();

     while(head != null) {
    	 list.add(String.valueOf(head.val));
    	 head = head.next;
     }
     int j = list.size()-1;
     for(int i = 0; i <= j; i++){
    	 if(!list.get(i).equals(list.get(j)))
    		 return false;
    	 
    	 j--;
     }
	
	return true;
    }

}
