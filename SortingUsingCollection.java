package week3.day2;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {
public static void main(String[] args) {
	String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
	String []name = new String[5];
	List<String> list = new ArrayList<>();
	list.add("HCL");
	list.add("Wipro");
	list.add("Aspire");
	list.add("Systems");
	list.add("CTS");
	System.out.println(list);
	System.out.println(list.size());
	Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	
}

}