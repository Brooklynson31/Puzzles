package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

//	Given two strings s and t, determine if they are isomorphic.
//	Two strings are isomorphic if the characters in s can be replaced to get t.
//	All occurrences of a character must be replaced with another character while preserving the order of characters. 
	//No two characters may map to the same character but a character may map to itself.
	
//	For example,
//	Given "egg", "add", return true.
//	Given "foo", "bar", return false.
//	Given "paper", "title", return true.
//	Note:
//	You may assume both s and t have the same length.
	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		System.out.println(isIsomorphic(s,t));
		
	}

	public static boolean isIsomorphic(String s, String t) {
		//integer will represent the index position
		//key will be index position
		//each index position has a char
		//CHARACTERS MUST MAP TO OTHER CHARACTER NOT INDEXES
		//LOOK AT FOO AND BAR VS OTHER TWO EXAMPLES
        Map<Character,Character> map1 = new HashMap<Character, Character>();
      
        for(int i = 0; i < s.length(); i++){
        	char c = s.charAt(i);
        	char d = t.charAt(i);
        	

        	if(map1.containsValue(d) && map1.containsKey(c) == false){
        		return false;
        	}
        	else{
        		map1.put(c, d);
        	}
        }
       
        for(int j = 0; j < t.length(); j++){
        	char e = s.charAt(j);
        	char f = t.charAt(j);
        	
        	if(map1.get(e) != f){
        		return false;
        	}
        }
        
        return true;
    }

}
