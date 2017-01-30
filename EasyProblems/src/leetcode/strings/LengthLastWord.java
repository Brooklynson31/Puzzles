package leetcode.strings;

public class LengthLastWord {
	
//	Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
//	return the length of last word in the string.
//  If the last word does not exist, return 0.
//  Note: A word is defined as a character sequence consists of non-space characters only.
//	For example, 
//	Given s = "Hello World",
//	return 5

	public static void main(String[] args) {
		String s = "a ";
		
		System.out.println(lengthOfLastWord(s));

	}
	
		public static int lengthOfLastWord(String s) {
			if(s.isEmpty())
				return 0;
			
			if(!s.contains(" "))
				return s.length();
			
			
	        String b = new StringBuilder(s).reverse().toString();
	        char c = ' ';
	        int length = 0;
	        int i = 0;
	        while( i <= b.length()-1 && b.charAt(i) == c) 
	        	i++;
	        
	        if(b.indexOf(c,i) == -1)
	        	length = b.length()-i; 
	        else
	        	length = b.indexOf(c, i) - i;
	        
	        return length;
	    }

}
