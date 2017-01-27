package leetcode.arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[] {9,9,9};
		//int[] digits = new int[] {9};
		digits = plusOne(digits);
		System.out.println(Arrays.toString(digits));
	}
	
	public static int[] plusOne(int[] digits) {
        int lastdigit = digits.length-1;
        int place = lastdigit;
        if(digits[lastdigit] != 9){
        	digits[lastdigit]++;
        } else {
        	
        	while(  place > -1 && digits[lastdigit--] == 9){
        		digits[place] = 0;
        		place--;
        	}
        	  if (digits[0] == 0){
        		int[] A = new int[digits.length+1];
        		A[0] = 1;
        		
        		return A;
        	} else {
        		digits[place] = digits[place]+1;
        	}
        }
		return digits;
    } 
//	if(place > -1){
//    	digits[place] = digits[place]+1;
//    	}
}
