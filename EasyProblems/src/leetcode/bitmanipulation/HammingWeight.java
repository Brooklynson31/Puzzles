package leetcode.bitmanipulation;

public class HammingWeight {
//	Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
//
//	For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

	public static void main(String[] args) {
		int n = 15;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(n-1));
		
		//System.out.println(Integer.bitCount(n));

		
		hammingWeight2(n);
		//System.out.println(hammingWeight(n));
	}

	// this method is a short cut because each operation will skip all bit places than contain 1
	
	public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){ //will continue to run until you are at 0 
        	n = n & (n-1);  //starting from right to left(bitwise AND) with n-1 will toggle all the bits until it arrives at a 1 in the bit

        					// reassigns n to an int that will have one less 1 bit in it
        	count++; //counts how many times it runs this operation
        }
		return count;
    }
	
	public static void hammingWeight2(int n) {
        Integer checkbit = 1; //start with check bit(1) at the right most position
        checkbit = checkbit << (Integer.SIZE/8 -1); //shifts the 1 in check bit so it is now at most significant position
        //right most position in the check bit should be 1 at every iteration
        int count = 0;
        while(checkbit != 0){ //once the right most 1 is movted out to the left AND is  shifted out(to the right), then check bit will be 0
        	int result = n & checkbit; //bitwise AND input int and right most bit
        		if(result == checkbit)
        			count++;
        	
        	checkbit = checkbit >>1; //keep shifting 1 in check bit ot the right until checkbit is 0
        }
        System.out.println(count);
    }
}
