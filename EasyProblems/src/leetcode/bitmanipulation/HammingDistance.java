package leetcode.bitmanipulation;

public class HammingDistance {
	
//	The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
//	Given two integers x and y, calculate the Hamming distance.
//
//	Note:
//	0 <= x, y < 231.
//
//	Example:
//
//	Input: x = 1, y = 4
//
//	Output: 2
//
//	Explanation:
//	1   (0 0 0 1)
//	4   (0 1 0 0)
//	       -   -
//
//	The above arrows point to positions where the corresponding bits are different.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 4;
		System.out.println(hammingDistance(x, y));
		
	}
	
	public static int hammingDistance(int x, int y) {
       int count = 0;
       
       for(int i = 0; i < 32; i++){
    	   int lastbitx = x & 1; //store the rightmost significant bit in x
    	   int lastbity = y & 1; //store the right most significant bit in y
    	   
    	   if(lastbitx != lastbity) //compare the two bits to see if they are equal
    		   count++;
    	   
    	   x >>=1; //shift left to next bit in x
    	   y >>=1;//shift left to next bit in y
       }
		
		
		return count;
    }

}
