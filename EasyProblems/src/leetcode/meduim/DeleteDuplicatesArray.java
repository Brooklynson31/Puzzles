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
	    int i = 0;
	    for (int n : nums)
	        if (i < 2 || n > nums[i-2])
	            nums[i++] = n;
	    return i;
    }

}
