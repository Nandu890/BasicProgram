package collection1;//WAP to display remove all the objects expect  String integer object from the ArrayList

import java.util.ArrayList;

public class ALPrgm9 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(-19);
		a1.add("Mahadev");
		a1.add('i');
		a1.add(20.8);
		a1.add(-31);
		a1.add(7);
		a1.add("Vishnu");
		
	System.out.println("**removing the all objects expect  String integer object from the ArrayList**");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer) {}
		else if (obj instanceof String) {}
		else {a1.remove(obj);}
		}System.out.println(a1);}}
