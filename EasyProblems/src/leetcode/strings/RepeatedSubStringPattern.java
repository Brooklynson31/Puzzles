package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

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
		String str = "abcabcabc";
		System.out.println(repeatedSubstringPattern(str));
//		int result=0;
//		for(int i = 0; i < str.length(); i++){
//			result = result ^ str.charAt(i);
//			System.out.println(result);;
//		}
	}
	//hast table if doest work
//	 public static boolean repeatedSubstringPattern(String str) {
//		  if(str.length() <= 1){
//				return false;
//			}
//		  Set<Character> set = new HashSet<Character>();
//	        	int[] alpha = new int[26];
//	        	int index = -1;
//	        	for(int i =0;i < str.length(); i++){
//				char c = str.charAt(i);
//				if(set.contains(c) == false){
//					set.add(c);
//				}
//				if(alpha[c-'a'] == 0){
//					++alpha[c-'a'];
//					index = alpha[c-'a'];
//				} else {
//					--alpha[c- 'a'];
//					index = alpha[c-'a'];
//				}
//			}
//			
//			for(int i =0; i < alpha.length;i++){				
//				if(alpha[i] != index)
//					return false;
//				
//			}
//			return true;
//
//	    }
	
//	public static boolean repeatedSubstringPattern(String str) {
//		int result = 0;
//		for(int i=0; i < str.length(); i++){
//			result ^= str.charAt(i); 
//		}
//
//
//		return (result == 0);
//	}
	
	public static boolean repeatedSubstringPattern(String str) {
    	int index = 0;
	    int[] alpha = new int[26];

		for(int i =0;i < str.length(); i++){
			char c = str.charAt(i);
				if(alpha[c-'a'] == 0){
					++alpha[c-'a'];
					index = alpha[c-'a'];
				} else if (--alpha[c-'a'] == 0) {
					--alpha[c- 'a'];
					index = alpha[c-'a'];
				}
		}

		return false;
    }
	


}
