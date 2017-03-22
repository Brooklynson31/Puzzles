package leetcode.bitmanipulation;

public class isPowerof2 {
//	Given an integer, write a function to determine if it is a power of two.



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(2147483646));
		System.out.println(Math.log(2147483646));
	}

	public static boolean isPowerOfTwo(int n) {

		if(n ==1 )
		    return true;
		else if(n < 0)
		    return false;
		else{	
			while(n > 1){
				n /= 2;
			}
			return n == 1;
	        }
		}
    
}
