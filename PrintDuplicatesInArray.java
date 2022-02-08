package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	ArrayList<String> list = new ArrayList<String>();
	list.add("14");
	list.add("12");
	list.add("13");
	list.add("11");
	list.add("15");
	list.add("14");
	list.add("18");
	list.add("16");
	list.add("17");
	list.add("19");
	list.add("18");
	list.add("17");
	list.add("20");
	System.out.println("List of numbers in array are  : "+list);
	System.out.println("Size of the Array :"+list.size());
	HashSet<Integer> hCheckSet = new HashSet<>();
    HashSet<Integer> hTargetSet = new HashSet<>();
    for (Integer integer : arr) {
       if(!hCheckSet.add(integer)) {
          hTargetSet.add(integer);
       }
    }
    System.out.println("Duplicate integers in given list is/are " + hTargetSet);
 }
}

