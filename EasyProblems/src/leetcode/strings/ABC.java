package leetcode.strings;

public class ABC {
	//split the needle by the haystack
	//and increment
	public static void main(String[] args) {
		String a = "ab/cder/abc/de";
		String[] array1 = a.split("%"); //you only one to split by 1; because you want the first occures

		
		for(int i= 0; i < array1.length;i++){
			System.out.println(array1[i]);
		}
		
		System.out.println(array1.length);

	}
	
	

}
