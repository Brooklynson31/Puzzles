package leetcode.bitmanipulation;

public class ReverseBits {
//	Reverse bits of a given 32 bits unsigned integer.
//
//	For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
//
//	Follow up:
//	If this function is called many times, how would you optimize it?

	public static void main(String[] args) {

		int n = 2678;
		System.out.println(reverseBits2(n));
		System.out.println(Integer.reverse(n));
	}
	
	 public static	int reverseBits(int n) {
	     int reverse = 0; //intialize the result
	     long  count = (Integer.SIZE/8); //counter to track the number of bits in the integer --> allows us to short circuit out of reversal
	    
	     while(n != 0){
	    	 int lastbit = n & 1; //extract the right most bit
	    	 reverse = reverse | lastbit; //add it to the rightmost bit of the result
	    	 reverse <<=1; //shift result left (insert next bit)
	    	 n  >>= 1; //shift original number right(extract next bit)
	    	 count --;
	    	 
	     }

	     reverse = reverse << count; // if the original number has only 0's shift left the remaining bits
		 
		 return reverse;
	    }
	 
	 public static int reverseBits2(int n){
		 if( n == 0) return 0; //edge case
		 
		 
		 int result = 0; //start result int at 0
		 for(int i = 0; i < 32;i++){ // iterate through each possible bit in n
			 result <<=1; //shift result bit over to left
			 if((n & 1) == 1) //if bitwise & oepration with 1 as checkbit returns 1(then n has 1 at that bit place
				 result++;  //increment bit at this position to 1 if n has 1 in this position.
			 n >>=1; //shift n to the left by 1 to extract next bit
		 }
		 
		 
		 return result;
	 }
	 

}
