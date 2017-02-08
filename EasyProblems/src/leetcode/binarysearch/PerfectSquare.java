package leetcode.binarysearch;

public class PerfectSquare {
	
//	Given a positive integer num, write a function which returns True if num is a perfect square else False.
//
//	Note: Do not use any built-in library function such as sqrt.
//
//	Example 1:
//
//	Input: 16
//	Returns: True
//	Example 2:
//
//	Input: 14
//	Returns: False

	public static void main(String[] args) {
		//System.out.println(Math.sqrt(808201));
		System.out.println(isPerfectSquare2(808201));
		//System.out.println(isPerfectSquare2(144));
	}
	
	public static boolean isPerfectSquare(int num) {
		
		int start = 1;
		int end = num;
		while(start <= end){
			long mid = (start +end) >>> 1;
			if(mid*mid == num)
				return true;
			else if(mid*mid > num)
				end = (int)mid -1;
			else 
				start =(int) mid+1;
			}
		return false;
    }
    
	public static boolean isPerfectSquare2(int num) {
		
		int result = isPerfectSquare(num, 1, num);
		if(result == 3) return false;
		if(result * result == num) return true;
		return false;
    }
	public static int isPerfectSquare(int num, int start, int end){
		int mid = start + (end - start)/2;
		if(start > end){ return 3;}
		if(mid*mid == num){ return mid;}
		else if(mid*mid < num){ return isPerfectSquare(num, mid+1, end);}
		else if(mid*mid > num){ return isPerfectSquare(num, start, mid-1);}
		else{return 3;}
		}
		
	}
	
	


