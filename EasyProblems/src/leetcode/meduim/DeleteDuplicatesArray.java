package leetcode.meduim;

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
		int[] nums = new int[] {2,2,2};

		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length < 3)
			return nums.length;
		if(nums.length == 0)
			return 0;
		int length = 0;
		int[] test = new int[]{0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < nums.length; i++){
        	test[nums[i]]++;
        }
       int repeat = 0;
		for(int i = 0; i < test.length; i++){
			if(test[i]  > 2){
				length = length+2;
				repeat = 2;
			}
			else if(test[i] > 0 && test[i] < 3){
				length = length+test[i];
				repeat = test[i];
			}
			
				int x = test[i]+repeat;
				int j = length;
				while(j < x-1){
					nums[j] = i+1;
					j++;
				}
			}
			
		
		
		
		return length;
    }

}
