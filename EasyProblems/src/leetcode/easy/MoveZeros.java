package leetcode.easy;

import java.util.Arrays;

public class MoveZeros {
//	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
//
//	Note:
//	You must do this in-place without making a copy of the array.
//	Minimize the total number of operations.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	  public static void moveZeroes(int[] nums) {
		  
	        int count = 0;
		  for(int i = 0; i < nums.length;i++){
			  if(nums[i] == 0){
				  count++;
			  } 
			  
		  }
		  if(nums.length == count || count == 0){
		      return;
		  }
		  int remain = nums.length - count;
		  for(int j = 0;  j < remain;j++){
			  if(nums[j] == 0){
				  int k = j;
				  while(++k < nums.length){
					  if(nums[k] != 0){
						  int temp = nums[k];
						  nums[k] = nums[j];
						  nums[j] = temp;
						  break;
					  }
				}
			 }
			  count--;
		  }
		  
		
		  
	    }

}
