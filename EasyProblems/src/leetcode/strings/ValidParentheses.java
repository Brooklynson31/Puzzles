package leetcode.strings;

import java.util.Stack;

public class ValidParentheses {
//	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//	The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.



	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));

	}
	
	public static boolean isValid(String s) {
		
		if(s.length() % 2 == 1 || s.isEmpty())
			return false;
		
		String left = "({[";
		Stack<Character> ls = new Stack<Character>();
		int i = 0;
		boolean isValid = true;
		
		while(i < s.length()){
			char c = s.charAt(i);
			if(left.contains(""+c)){
				ls.push(c);
			}
			else {
						if(ls.isEmpty()){
							isValid = false;
							break;
						} else if(c- ls.peek() == 2 || c- ls.peek() == 1) {
							ls.pop();
						}
			}
			i++;
		}
		
		if(!ls.isEmpty())
			isValid = false;
        
		return isValid;
    }

}
