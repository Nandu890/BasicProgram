package collection1;//WAp to swap the ArrayList Objects between the 1st and 2nd Index

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSwap {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add("Kanha");
	a1.add("Ramesh123R");
	a1.add('i');
	a1.add("Shiva");
	a1.add("AlphabetsR");
	a1.add(7);
	
System.out.println("Before the swap  "+a1);

Collections.swap(a1, 1, 2);
System.out.println("swapped objects of a1  "+a1);
}
}
