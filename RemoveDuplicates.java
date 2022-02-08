package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.io.Charsets;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String txt = "PayPal India";
		char[] array = txt.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < array.length; i++) {
			if(charSet.add(array[i])) {
				
			}else {
				dupCharSet.add(array[i]);
				
			}
		}
		for(Character character :dupCharSet) {
			if(charSet.contains(character)) {
				charSet.remove(character);
			}
		}
		for(Character character : charSet) {
			if(character == ' ') {
				
			}else {
				System.out.println(character);
			}
		}
		
	}

}
