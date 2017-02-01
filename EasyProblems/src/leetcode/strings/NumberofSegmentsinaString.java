package leetcode.strings;

import java.util.Arrays;

public class NumberofSegmentsinaString {
//	Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
//
//	Please note that the string does not contain any non-printable characters.

	public static void main(String[] args) {

		String s = ", , , ,        a, eaefa";
		System.out.println(countSegments(s));
	}
	
	public static int countSegments(String s) {
		if(s.isEmpty())
			return 0;
		
		String[] a = s.split(" ");
		int segs = 0;
		for(int i = 0; i < a.length; i++){
			if(!a[i].equals("")){
				segs++;
			}
			
		}
		System.out.println(Arrays.toString(a));
			
		return segs;
    }
	
	

}
