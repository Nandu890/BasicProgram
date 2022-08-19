package collection1;//WAP to Display integer object Greater than 15 from the ArrayList.

import java.util.ArrayList;

public class AlPrgm6 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(-19);
		a1.add("Ramesh");
		a1.add('i');
		a1.add(20.8);
		a1.add(-31);
		a1.add(7);
		
	System.out.println("**integer object from the ArrayList**");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer) {
			int num=(int)obj;
			if(num>15) {
				System.out.println(num);	
			}}}}}
