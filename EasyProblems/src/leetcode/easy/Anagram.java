package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {

		String s = "aa";
		String t = "a";
		
		System.out.println(isAnagram(s,t));
	}
	
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> stringS = new HashMap<Character, Integer>();
        Map<Character, Integer> stringT = new HashMap<Character,Integer>();
        
          for(int i = 0; i < s.length(); i++){
              char c = s.charAt(i);
                 if(stringS.containsKey(c)){
                	 int val = stringS.get(c);
                	 val++;
                	 stringS.put(c, val);
               
           } else{
               stringS.put(c,1);
           }
          }
                 
           for(int j =0; j < t.length(); j++){
        	   char d = t.charAt(j);
        	   if(stringT.containsKey(d)){
        		   int val = stringT.get(d);
        		   val++;
        		   stringT.put(d, val);
        	   } else {
        		   stringT.put(d, 1);
        	   }
           }
    
      return stringT.equals(stringS);
    }
}



