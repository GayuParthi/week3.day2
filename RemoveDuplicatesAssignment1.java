package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesAssignment1 {
public static void main(String[] args) {

	/** * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
	String text = "We learn java basics as part of java sessions in java week1";
	int count = 0;
	String[] array = text.split(" ");
	ArrayList<String> original = new ArrayList<String>();
	ArrayList<String> duplicate = new ArrayList<String>();
	for(int i=0;i<array.length;i++) {
		original.add(array[i]);
		duplicate.add(array[i]);
		}
	for (String string : duplicate) {

		if(string.equals("java")) {
			count++;
		}if(count>=1) {
			original.remove("java");
			
		}
	}
	 
	System.out.println(original);
	
}


}	
	
	
	
	
	
	
	
	
	
	
	


