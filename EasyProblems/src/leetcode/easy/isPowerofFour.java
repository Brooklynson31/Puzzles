package leetcode.easy;

public class isPowerofFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfFour(1));
	}

	public static boolean isPowerOfFour(int num) {
		if(num < 0)
			return false;
        return(2 * (num / 4) == num);
    }
}
