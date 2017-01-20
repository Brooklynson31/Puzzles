package leetcode.arrays;

public class MaxConsecutive1s {
//	Given a binary array, find the maximum number of consecutive 1s in this array.
//
//	Example 1:
//	Input: [1,1,0,1,1,1]
//	Output: 3
//	Explanation: The first two digits or the last three digits are consecutive 1s.
//	    The maximum number of consecutive 1s is 3.
//	Note:
//
//	The input array will only contain 0 and 1.
//	The length of input array is a positive integer and will not exceed 10,000

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int[] nums = new int[] {1,0,1,1,0,1};
	//	int[] nums = new int[] {0,1};
	//	int[] nums = new int[] {1,1,0};
	//	int[] nums = new int[] {1,1,0,1};
		int[] nums = new int[] {1,1};


		System.out.println(findMaxConsecutiveOnes(nums));

	}
	
	//think of way that increments max1s and length according to comparing value of iterator to the last value
	public static int findMaxConsecutiveOnes(int[] nums) {
		if(nums.length ==0){
			return 0;
		}
		if(nums.length == 1 && nums[0] == 1){
			return 1;
		}
        int max1s = 0;
        for(int i = 0; i <= nums.length-1;i++){
        	int length = 0;
        	if(nums[i] == 1){
        		int k = i;
                while(k <= nums.length-1 && nums[k] ==1){
                	length++;
                	k++;
        		}
        		if(length > max1s) max1s = length;
        		i = k;
        	} else {
        		continue;
        	}
        	
        }
		
		return max1s;
    }

}
