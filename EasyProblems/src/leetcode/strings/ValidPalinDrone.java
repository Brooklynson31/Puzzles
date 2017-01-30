package leetcode.strings;

import java.util.Stack;

public class ValidPalinDrone {
	
//	Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//	For example,
//	"A man, a plan, a canal: Panama" is a palindrome.
//	"race a car" is not a palindrome.
//
//	Note:
//	Have you consider that the string might be empty? This is a good question to ask during an interview.
//
//	For the purpose of this problem, we define empty string as valid palindrome.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "QZrD2 7UL91z,i`O2ef:6e'2\"yP !:,U.:pX90PU3CXo'i!;3 `j 0?\"'hK8 ? BAjM2\"DBw?7!4R3?U2E8F2y!?3 R2!fw 6e!:0  ErCi98KM`,8`8648,mi3P0`,!5 E.?00J3A 52\"x8,tHy!'2!DLBbK'j!tt1C' 7`JPulW\"\"uRTbr\"',\",U`ZOW5'\"LMDQDMJ\"'5WOZ`U,\",'\"rbTRu\"\"WluPJ`7 'C1tt!j'KbBJD!2'!yHt,8x\"25 A3J00?.E 5!,`0P3im,8468`8,`MK89iCrE  0:!e6 wf!2R 3?!y2F8E2U?3R4!7?wBD\"2MjAB ? 8Kh'\"?0 j` 3;!i'oXC3UP09Xp:.U,:! Py\"2'e6:fe2O`i,z19LU7 2DrZQ";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		if(s.isEmpty() || s.length() == 1){
			return true;
		}
		String test = s.toUpperCase().trim();
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int j = test.length()-1;
		for(int i = 0; i <= j;i++){
			if(alpha.contains(""+test.charAt(i))){
				while(alpha.contains(""+test.charAt(j)) == false && j >= 0){
					j--;
				}
				char a = test.charAt(i);
				char b = test.charAt(j);
				if(a != b){
					return false;
				}
				j--;
			}
			
		}
		return true;
    }

}
