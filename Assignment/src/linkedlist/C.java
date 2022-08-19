package linkedlist;

import java.util.LinkedList;

public class C {
	public static void main(String[] args) {
		
	LinkedList a1=new LinkedList();
	a1.add(20);
	a1.add("Kanha");
	a1.add(121);
	a1.add(true);
	a1.add('i');
	a1.add(88);
	a1.add(20.25);
	a1.add(7);
	
	System.out.println("**Even Integer objects are**");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer) {
		int num= (int) obj;
	
			if (num%2==0) {
				System.out.println(num);
			}}}}}
				

