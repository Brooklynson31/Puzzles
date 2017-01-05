package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
//	Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
//
//	You may assume that the array is non-empty and the majority element always exist in the array.

	public static void main(String[] args) {

		int[] nums = new int[] {1,3,1,2,1,6,1,5,1,1};
		System.out.println(majorityElement2(nums));
		
	}
	
	  public int majorityElement(int[] nums) {
		  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0;i<nums.length;i++ ){
	        	if(map.containsKey(nums[i])){
	        		int val = map.get(nums[i]);
	        		val++;
	        		map.put(nums[i], val);
	        	}
	        	else{
	        		map.put(nums[i], 1);
	        	}
	        	if(map.get(nums[i]) > nums.length/2){
	        		return nums[i];
	        	}
	        }
	        return -1;
	  }
	  
	  public static int majorityElement2(int[] nums) {
		  Arrays.sort(nums);
		  int half = nums.length/2;
		 
		  
		  for(int i = 0; i < nums.length; i++){
			  int a = Arrays.asList(nums).lastIndexOf(nums[i]);
			  if(i -  Arrays.asList(nums).lastIndexOf(nums[i]) > half){
				  return nums[i];
			  }
			  
		  }
	        return -1;
	  }
	  

}
