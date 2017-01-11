package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
//	Given an array and a value, remove all instances of that value in place and return the new length.
//
//	Do not allocate extra space for another array, you must do this in place with constant memory.
//
//	The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//	Example:
//	Given input array nums = [3,2,2,3], val = 3
//
//	Your function should return length = 2, with the first two elements of nums being 2.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,2,2,3};
		System.out.println(removeElement(nums,3));
		System.out.println(Arrays.toString(nums));
	}

	public static int removeElement(int[] nums, int val) {
		int insert = 0;
		int result = 0;
		for(int a: nums){
			if(a != val){
				nums[insert++] = a;
				result++;	
			} 
		}
        
    return result;
	}
}
