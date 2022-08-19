package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDescending {
public static void main(String[] args) {
	
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(12);
	a1.add(586);
	a1.add(88);
	a1.add(89);
	a1.add(5);
	a1.add(7);
	
	System.out.println("Before Descending "+a1);

	Collections.sort(a1);//Scenario---->1
	Collections.reverse(a1);
	System.out.println("After Descending "+a1);
	
	Comparator<Object> a2=Collections.reverseOrder();//Scenario------>2
	a1.sort(a2);
	System.out.println("After Descending "+a1);
}
}
