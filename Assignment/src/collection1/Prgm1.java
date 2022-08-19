package collection1;//WAP to display only the string object from the arraylist

import java.util.ArrayList;
public class Prgm1 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add("hi");
		a1.add("hello");
		a1.add('c');
		for (int i = 0; i <a1.size(); i++) {
			Object obj=a1.get(i);
			if (obj instanceof String) {
				System.out.println(obj);
				
			}}}}
