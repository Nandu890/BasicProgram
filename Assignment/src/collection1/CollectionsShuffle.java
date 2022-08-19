package collection1;//WAP to shuffle the ArrayList

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsShuffle {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add("Kanha");
	a1.add("Ramesh123R");
	a1.add('i');
	a1.add("Shiva");
	a1.add("AlphabetsR");
	a1.add(7);
	System.out.println("Before the Shuffle  "+a1);
	
	Collections.shuffle(a1);
	System.out.println("After the Shuffle  "+a1);
}
}
