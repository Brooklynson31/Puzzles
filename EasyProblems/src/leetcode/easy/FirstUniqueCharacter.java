package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dddccdbba";
		
		System.out.println(firstUniqChar(s));

	}


	public static int firstUniqChar(String s) {
		
	Set<Character> set = new HashSet<Character>();	
    
    if(s.length() == 1)
        return 0;
   	for(int i = 0; i < s.length();i++){
		char c = s.charAt(i);
			String start = s.substring(0, i);
			int beg = start.indexOf(c);
			String end = s.substring(i+1);
			int rest = end.indexOf(c);
			if(rest == -1 && beg == -1){
				return i;
			}
 		}
   		return -1;    
	}
}

