package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	
	
	
	
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
	
		System.out.println(canConstruct(a,b));

	}
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 if(ransomNote.length() > magazine.length())
			 return false;
		 Map<Character,Integer> ransomMap = new HashMap<Character, Integer>();
		 Map<Character,Integer> magazineMap = new HashMap<Character, Integer>();
		 
		 for(int i = 0; i <= ransomNote.length()-1; i++){
			 char c = ransomNote.charAt(i);
			 if(ransomMap.containsKey(c)){
				 int val = ransomMap.get(c);
				 ransomMap.put(c, ++val);
			 }
			 else{
				 ransomMap.put(c, 1);
			 }
		 }
		 
		 for(int j = 0; j <= magazine.length()-1; j++){
			 char d = magazine.charAt(j);
			 if(magazineMap.containsKey(d)){
				 int val = magazineMap.get(d);
				 magazineMap.put(d, ++val);
			 }
			 else{
				 magazineMap.put(d, 1);
			 }	
			 
		 }
	
		 for(Character a:ransomMap.keySet() ){
			 if(!magazineMap.containsKey(a) || ransomMap.get(a) > magazineMap.get(a)){
				 return false;
			 }
			
		 }
	     
		 
		 return true;
	    }

}
