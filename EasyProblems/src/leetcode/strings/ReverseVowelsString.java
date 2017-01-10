package leetcode.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseVowelsString {
//	Write a function that takes a string as input and reverse only the vowels of a string.
//
//	Example 1:
//	Given s = "hello", return "holle".
//
//	Example 2:
//	Given s = "leetcode", return "leotcede".
//
//	Note:
//	The vowels does not include the letter "y".

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aA";
		System.out.println(reverseVowels(s));
	}
	
	 public static String reverseVowels(String s) {
		 List<Character> vowels = new ArrayList<Character>();
		 Stack<Character> sta = new Stack<Character>();
		 vowels.add('a');  vowels.add('A');
		 vowels.add('e'); vowels.add('E');
		 vowels.add('i'); vowels.add('I');
		 vowels.add('o'); vowels.add('O');
		 vowels.add('u'); vowels.add('U');
		
		 
		char[] d = s.toCharArray();
		 
		 for(char c: d){
			 if(vowels.contains(c)){
				sta.push(c);
			 }
		 }
		 
		for(int j = 0; j < d.length; j++){
			if(vowels.contains(d[j])){
				d[j] = sta.pop();
				
			}
		}
	
		 return String.valueOf(d);

	    }

}
