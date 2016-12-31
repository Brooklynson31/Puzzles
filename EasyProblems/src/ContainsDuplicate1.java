import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate1 {
//	Given an array of integers, find if the array contains any duplicates. 
//	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> dups = new HashSet<Integer>();
		for(int a: nums){
			if(dups.add(a) == false)
				return true;
			
		}
		return false;
    }

}
