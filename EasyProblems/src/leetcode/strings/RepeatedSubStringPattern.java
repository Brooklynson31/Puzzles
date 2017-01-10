package leetcode.strings;

public class RepeatedSubStringPattern {
//	Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
//
//	Example 1:
//	Input: "abab"
//
//	Output: True
//
//	Explanation: It's the substring "ab" twice.
//	Example 2:
//	Input: "aba"
//
//	Output: False
//	Example 3:
//	Input: "abcabcabcabc"
//
//	Output: True
//
//	Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcabcabc";
		System.out.println(repeatedSubstringPattern(str));
	}
	
	public static boolean repeatedSubstringPattern(String str) {
		int index = 0;
		int[] alpha = new int[26];
		for(int i =0;i < str.length(); i++){
			char c = str.charAt(i);
			if(++alpha[c-'a'] > 1){
				alpha[c-'a']--;
				index = i;
				break; 
			}
		}
		str.substring(0, index);
		
		
		
		
		return true;
    }

}
