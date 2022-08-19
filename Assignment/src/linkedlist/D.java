package linkedlist;//WAP to display  only Integer &Double object

import java.util.LinkedList;

public class D {
	public static void main(String[] args) {
		
		LinkedList a1=new LinkedList();
		a1.add(20);
		a1.add("Kanha");
		a1.add(121);
		a1.add(true);
		a1.add('i');
		a1.add(86.54556565);
		a1.add(20.25);
		a1.add(7);
		
		System.out.println("**Double & Integer objects**");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer || obj instanceof Double) {
			System.out.println(obj);
		}}}}