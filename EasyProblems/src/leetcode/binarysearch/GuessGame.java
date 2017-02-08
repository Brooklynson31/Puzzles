package leetcode.binarysearch;

public class GuessGame {
	
//		We are playing the Guess Game. The game is as follows:
//
//		I pick a number from 1 to n. You have to guess which number I picked.
//
//		Every time you guess wrong, I'll tell you whether the number is higher or lower.
//
//		You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
//
//		-1 : My number is lower
//		 1 : My number is higher
//		 0 : Congrats! You got it!
//		Example:
//		n = 10, I pick 6.
//
//		Return 6.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int guessNumber(int n) {
        return bsearch(1,n);
 }
     private int bsearch(int min,int max){
          int mid = max/2;

         if (guess(mid) == 0) {
             return mid;
         } else if (guess(mid) == -1) {
             return bsearch(min, mid);
         } else {
             return bsearch(mid + 1, max);
         }
 }
     public int guess (int num){
    	 return 0;
     }

	

}
