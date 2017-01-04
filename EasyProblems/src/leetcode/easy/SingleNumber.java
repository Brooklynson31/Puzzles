package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

//	Given an array of integers, every element appears twice except for one. Find that single one.
//	Your algorithm should have a linear runtime complexity.
//Could you implement it without using extra memory?
	public static void main(String[] args) {
		int[] nums = new int[]{2,2,1};
		
		System.out.println(singleNumber(nums));
	}
	
	 public static int singleNumber(int[] nums) {
		 Map<Integer,Integer> ab = new HashMap<Integer,Integer>();
		 
		 
		 for(int i = 0 ; i < nums.length;i++){
			 if(ab.containsKey(nums[i])){
				 int val = ab.get(nums[i]);
				 val++;
				 ab.put(nums[i], val);
			 }
			 else{
				 ab.put(nums[i], 1);
			 }
		 }
		 for(Integer a: ab.keySet()){
			 if(ab.get(a) == 1){
				 return a;
			 }
		 }
		 
		 return 0;
	    }
	

}
