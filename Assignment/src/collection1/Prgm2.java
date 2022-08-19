package collection1;//WAP to print all the string object 
//starting with the letter capital 'R".from the arraylist

import java.util.ArrayList;
public class Prgm2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add("Ramesh");
		a1.add("hi");
		a1.add("hello");
		a1.add('c');
		a1.add("Rahul");
		 
		for (int i = 0; i <a1.size(); i++) {
			Object obj=a1.get(i);
			if (obj instanceof String) {
				
			String s=(String) obj;
				
			if (s.charAt(0)=='R') {
				System.out.println(s);
			}}}}}
