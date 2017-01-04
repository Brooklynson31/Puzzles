package leetcode.easy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] {1,0,1,1};
		System.out.println(containsNearbyDuplicate2(nums,1));
	}
	

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int indexdiff = 0;
		boolean result = false;	
			Map<Integer,List<Integer>> unique = new HashMap<Integer,List<Integer>>();
			for(int i = 0; i < nums.length; i++){
				if( unique.containsKey(nums[i]) ){
					List<Integer> dups = unique.get(nums[i]);
					dups.add(i);
					if( (dups.get(dups.size()-1) - dups.get(dups.size()-2)) <= k ){
						result = true;
						return true;
					}
					else{
						unique.put(nums[i], dups);
					}
				}
				else{
					List<Integer> values = new ArrayList<Integer>();
					values.add(i);
					unique.put(nums[i], values );
					}
			}
			return result;
	}
	
	public static boolean containsNearbyDuplicate2(int[] nums, int k) {
	    Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) 
            	set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) 
            	return true;
        }
        return false;
	}

}
