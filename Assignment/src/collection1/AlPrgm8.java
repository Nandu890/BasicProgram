package collection1;//WAP to diplay the String object ending with letter 'R' from the ArrayList

import java.util.ArrayList;

public class AlPrgm8 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add("Kanha");
		a1.add("Ramesh123R");
		a1.add('i');
		a1.add("Shiva");
		a1.add("AlphabetsR");
		a1.add(7);
		System.out.println("**The String object ending with letter 'R' from the ArrayList**");
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof String) {
			String s=(String)obj;
			if (s.lastIndexOf('R')>0) {
				System.out.println(s);
}}}}}
