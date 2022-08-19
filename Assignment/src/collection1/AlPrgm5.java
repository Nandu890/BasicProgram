package collection1;//WAP to Display negative integer value from the ArrayList.

import java.util.ArrayList;
public class AlPrgm5 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(-19);
		a1.add("Ramesh");
		a1.add('i');
		a1.add(20.8);
		a1.add(-31);
		a1.add(7);
		
		System.out.println("**negative iteger value**");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer) {
			int num=(int)obj;
			if(num<0) {
				System.out.println(num);	
			}
	}}}}
