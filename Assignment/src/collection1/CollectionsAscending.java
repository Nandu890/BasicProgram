package collection1;//WAP to sort the ArrayList Object in the Ascending Order

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAscending {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(12);
	a1.add(586);
	a1.add(88);
	a1.add(89);
	a1.add(5);
	a1.add(7);
	System.out.println("Before the sorting "+a1);

	Collections.sort(a1);
	System.out.println("After the sorting "+a1);
}
}
