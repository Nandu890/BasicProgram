package collection1;//WAP to print the only odd numbers from the ArrayLIst.

import java.util.ArrayList;

public class ArraListPrgm1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(19);
		a1.add("Ramesh");
		a1.add('i');
		a1.add(20.8);
		a1.add(31);
		
	System.out.println("Only the odd numbers from the Arraylist");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer) {
			int num=(int)obj;
		if (num%2==1) {
			System.out.println(num);
		}}}}}
