package leetcode.easy;
import java.util.Arrays;

public class RemoveA {

	public static void main(String[] args) {

		int[] nums = new int[] {1,2,2,3,6,6};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));

	}
	
	public static int removeDuplicates(int[] A) {
	   if (A.length==0) return 0;
	    int j=0;
	    for (int i=0; i<A.length; i++)
	        if (A[i]!=A[j]) 
	        	A[j++]=A[i];
	    return j++;
	}

}
