package leetcode.strings;

public class Implementstrstr {
//
//	Returns the index of the first occurrence of needle in haystack,
//	or -1 if needle is not part of haystack.

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "pi";
		
		System.out.println(strStr(haystack,needle));
	}

	public static int strStr(String haystack, String needle) {
		if(needle.length() == 0)
        	return 0;
		
		String[] bass = haystack.split(needle,2);
		if(bass.length == 1)
        	return -1;
        int i = haystack.indexOf(needle);
        
        return i;
    }
}
