package linkedlist;

import java.util.LinkedList;//WAP All the String Objects starts with 'S'

public class E {
	public static void main(String[] args) {
		
		LinkedList a1=new LinkedList();
		a1.add(20);
		a1.add("Sahana");
		a1.add(121);
		a1.add(true);
		a1.add('i');
		a1.add(86.54556565);
		a1.add("Shiva");
		a1.add(7);
		
		for (int i = 0; i < a1.size(); i++) {
			Object obj=a1.get(i);
			if (obj instanceof String) {
				String s=(String) obj;
				
					if (s.charAt(0)=='S') {
						System.out.println(s);
					}}}}}
					
			