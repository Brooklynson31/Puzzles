import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
//	Write a program that outputs the string representation of numbers from 1 to n.
//
//	But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
//	For numbers which are multiples of both three and five output “FizzBuzz”

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 15;
	}
	
	  public List<String> fizzBuzz(int n) {
		 List<String> list = new ArrayList<String>();
		  
		  for( int i = 1; i <= n;i++){
			  boolean Fizz = (i % 3 == 0);
			  boolean Buzz = (i % 5 == 0);
			  if(Fizz && Buzz){
				  list.add("FizzBuzz");
			  }
			  else if(Buzz){
				  list.add("Buzz");
			  }
			  else if (Fizz){
				  list.add("Fizz");
			  } else {
			  list.add(String.valueOf(i));
			  }
		  }
	        
		  return list;
	    }

}
