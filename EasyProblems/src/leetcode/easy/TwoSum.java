package leetcode.easy;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] test = new int[]{-1,-2,-3,-4,-5};
		
		System.out.println(Arrays.toString(twoSum(test,-8)) );
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        int[] newarray = new int[2];
        for(int i = 0; i < nums.length; i++){
           // if(nums[i] <= target){
                for(int j = i+1; j < nums.length;j++){
                    if(nums[i] + nums[j] == target) {
                    first = i;
                    second = j;
                   }
                }
            //}
        
        }
        newarray[0] = first;
        newarray[1] = second;
        
        return newarray;
    }

}
