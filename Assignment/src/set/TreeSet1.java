package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet a1= new TreeSet();
		a1.add(25);
		a1.add(55);
		a1.add(252);
		a1.add(252);
		a1.add(87);
		a1.add(66);
		System.out.println("Objects in Ascending order");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList(a1);
		Collections.reverse(a2);
		
		System.out.println("Objects in Descending order");
		System.out.println(a2);
		
	}

}
