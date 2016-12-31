import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	/*
	 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
	 * Do not allocate extra space for another array, you must do this in place with constant memory.
	 * For example,Given input array nums = [1,1,2],
	 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
	 */

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));


		
	}
	 public static int removeDuplicates(int[] nums) {
		 int newSize = nums.length;
		 int j = nums.length;
		 Set<Integer> dups = new HashSet<Integer>();	
		 for(int i = 0; i < newSize; i++){
			 if(dups.add(nums[i]) == false){
				 newSize--;
				 int temp = nums[i];
				 nums[i] = nums[j-1];
				 nums[j-1] = temp;
				 int lastIndex = nums[newSize];
				 if(lastIndex == nums[i]){
					 newSize--;
				 }
				 else
				 while(i <= newSize && nums[i] < lastIndex){
					 nums[i+1] = nums[i];
					 i++;
				 }
				 
			 }
			 
		 }
		 
		 
	     return newSize;   
	    }

}
