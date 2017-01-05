package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));

	}
	
	  public static char findTheDifference(String s, String t) {
		  //put both Strings into maps Character, Int
		  //put all chars in Strings into maps
		  //return key of value that does not match
			 Map<Character,Integer> S = new HashMap<Character,Integer>();
			 Map<Character,Integer>  T = new HashMap<Character,Integer>();

			 for(Character a: s.toCharArray()){
				 if(S.containsKey(a)){
					 int count = S.get(a);
					 count++;
					 S.put(a, count);
				 }
				 else{
					 S.put(a, 1);
				 }
			 }
			 
			 for(Character a: t.toCharArray()){
				 if(T.containsKey(a)){
					 int count = T.get(a);
					 count++;
					 T.put(a, count);
				 }
				 else{
					 T.put(a, 1);
				 }
			 }
			 
			 for(Character d: T.keySet()){
				 if(T.get(d) != S.get(d) ){
					return d;
				 }
			 }
		  
	 
		  return 'c';
	  }

}
