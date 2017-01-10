package leetcode.easy;


public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dddccdbba";
		
		System.out.println(firstUniqueChar2(s));

	}


	public static int firstUniqChar(String s) {
		
    
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
	
	public static int firstUniqueChar2(String s){
		int[] freq = new int[26];
		for(int i = 0; i < s.length(); i++){
			int f = s.charAt(i) - 'a';
			freq[f]++;
		}
		
		
		
		
		return -1;
	}
}

