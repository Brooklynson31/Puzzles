package leetcode.bitmanipulation;

public class PowerOfFour {
	
//	Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
//
//	Example:
//	Given num = 16, return true. Given num = 5, return false.

	public static void main(String[] args) {

		int num = 16;
		System.out.println(isPowerOfFour(num));
	}

	
	public static boolean isPowerOfFour(int num) {
		if( num <= 0 ) return false; // 0 and negative numbers dont cont
        int count = 0;
		while(num != 1){ //only one 1 in a power of 4 binary number
			
			if((num & 1) == 0) count++; //check least significant bit with bitwise & check
			else return false; //if a 1 is found before num == 1, then not a power of 4
			num>>= 1; //right shift to check next bit in num
		}
		return (count % 2 == 0 ); //even amount of 0s in a power of 4 binary number
	}
	
	public static boolean isPowerOfFour2(int num) {
		
        return num>0 && (num & (num-1)) == 0 && Integer.numberOfTrailingZeros(num)%2==0;
	}

}
