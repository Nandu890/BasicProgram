package collection1;//WAP to Display String Whose length of the object is 5  from the ArrayList.

import java.util.ArrayList;

public class AlPrgm7 {
public static void main(String[] args) {
	
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add("Kanha");
	a1.add("Ramesh123");
	a1.add('i');
	a1.add("Shiva");
	a1.add("Alphabets");
	a1.add(7);
	System.out.println("**The Alphabet object from the ArrayList**");
for (int i = 0; i < a1.size(); i++) {
	Object obj=a1.get(i);
	if (obj instanceof String) {
		String s=(String)obj;
		if (s.length()==5) {
			System.out.println(s);
		}}}}}
			

