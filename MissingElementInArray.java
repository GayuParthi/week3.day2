package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingElementInArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
    Set<Integer> set = new TreeSet<>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(7);
	set.add(6);
	set.add(8);
	System.out.println(set);
	
	int j = 1;
	
	for (int i = 0; i < arr.length; i++) {
		if(j!=arr[i]) {
			System.out.println(j);
			break;
		}
		j++;
		
	}
}
}
