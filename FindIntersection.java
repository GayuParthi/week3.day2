package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FindIntersection {
	public static void main(String[] args) {

		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		LinkedHashSet<Integer> a = new LinkedHashSet<>();
		LinkedHashSet<Integer> b = new LinkedHashSet<>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		System.out.println("First Array : "+a);
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);
		System.out.println("Second Array : "+b);
		a.retainAll(b);
		System.out.println("Intersection: "+a);
			
		
		
	}

}
