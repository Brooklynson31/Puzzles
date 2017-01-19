package leetcode.meduim;

import java.util.Set;
import java.util.TreeSet;

public class DeleteDuplicatesArray {
//	What if duplicates are allowed at most twice?
//
//			For example,
//			Given sorted array nums = [1,1,1,2,2,3],
//
//			Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = new int[] {1,1,1,2,2,3};
		int[] nums = new int[] {-1,0,0,0,0,3,3};

		System.out.println(removeDuplicates(nums));
	}
	
	//use set and incrementer to keep track of how often each value appears in given array
	//check if the int is in the set, if its not, add it and increment the int that will hold num of occures for each value
	//second loop to reassgn values
	//OR use hash map and incrememnt num of occurrences
	public static int removeDuplicates(int[] nums) {
//		if(nums.length < 3)
//			return nums.length;
//		int length = 0;
//		//int[] test = new int[]{0,0,0,0,0,0,0,0,0,0};
//		int[] test = new int[nums.length];
//        for(int i = 0; i < nums.length; i++){
//        	if(nums[i] < 0){ //cant handle negative integers -->make second array and use absolute val function
//        		length++;
//        	}
//        	else{
//        	test[nums[i]]++;
//        
//        	}
//        }
//       int repeat = 0;
//		for(int i = 0; i < test.length; i++){
//			if(test[i]  > 2){
//				length = length+2;
//				repeat = 2;
//			}
//			else if(test[i] > 0 && test[i] < 3){
//				length = length+test[i];
//				repeat = test[i];
//			}
//			
//				int x = length;
//				int j = length-repeat;
//				while(j < x-1){
//					nums[j] = i+1;
//					j++;
//				}
//			}
//		return length;
		if (nums.length < 3){
			return nums.length;
		}
		int length = 0;
		Set<Integer> set = new TreeSet<Integer>();
		
		
		return length;
    }

}
