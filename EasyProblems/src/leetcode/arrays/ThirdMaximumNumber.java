package leetcode.arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
//			Given a non-empty array of integers, return the third maximum number in this array.
//			If it does not exist, return the maximum number. The time complexity must be in O(n).
//
//			Example 1:
//			Input: [3, 2, 1]
//
//			Output: 1
//
//			Explanation: The third maximum is 1.
//			Example 2:
//			Input: [1, 2]
//
//			Output: 2
//
//			Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
//			Example 3:
//			Input: [2, 2, 3, 1]
//
//			Output: 1
//
//			Explanation: Note that the third maximum here means the third maximum distinct number.
//			Both numbers with value 2 are both considered as second maximum.

	public static void main(String[] args) {
		int[] digits = new int[] {1,-214748367,2,6,7,8};
		System.out.println(thirdMax(digits));;
	}
		public static int thirdMax(int[] nums) {
			Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
			Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
			for(int i = 0; i < nums.length;i++){
				if(set.add(nums[i])){
					queue.add(nums[i]);
				}
			}	
			
			if(set.size() < 3){
				int i = 0;
				for(Integer a: set){
					i = a;
				}
				return i;
			}
			 queue.remove();
			 queue.remove();
			 int a = queue.remove();
			
			return a;
	    }
    

}
