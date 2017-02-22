package leetcode.bitmanipulation;

public class HammingWeight {
//	Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
//
//	For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

	public static void main(String[] args) {
		int n = 15;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(n-1));
		
		System.out.println(Integer.bitCount(n));

		
		//hammingWeight2(n);
		System.out.println(hammingWeight(n));
	}

	// this method is a short cut because each operation will skip all bit places than contain 1
	
	public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){ //will continue to sun until you are at 0 
        	n = n & (n-1); // assigns n to an int that will have an int value that has all the bits toggled all the way up to the first 1 bit(will be changed to 0)
        	count++; //counts how many times it runs this operation
        }
		
		return count;
    }
	
	public static void hammingWeight2(int n) {
        Integer test = 1 << (Integer.SIZE/8 -1); //right most position in the check bit should be 1 at every iteration
        while(test != 0){
        	int result = n & test;
        	if(result == test){
        		System.out.println(1);
        	} else {
        		System.out.println(0);
        	}
        	
        	test = test >>1;
        }
    }
}
