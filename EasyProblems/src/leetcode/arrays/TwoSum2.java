package leetcode.arrays;

public class TwoSum2 {
//	Given an array of integers that is already sorted in ascending order, 
//	find two numbers such that they add up to a specific target number.
//
//	The function twoSum should return indices of the two numbers such that they add up to the target,
//	where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//
//	You may assume that each input would have exactly one solution.
//
//	Input: numbers={2, 7, 11, 15}, target=9
//	Output: index1=1, index2=2

	public static void main(String[] args) {
		int[] numbers = new int[] {2,4,7,8,19};
		numbers = twoSum(numbers,15);
		System.out.println(numbers);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for(int i = 0 ; i < nums.length;i++){
        	int j = nums.length-1;
        	if(nums[i] == nums[j]){
        		
        	}
        }
		
		
		return result;
    }
	
	

}
