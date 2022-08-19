package collection1;////WAP to Display Alphabets from the ArrayList.

import java.util.ArrayList;

public class ALPrgm4 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(191);
	a1.add("Ramesh123");
	a1.add('i');
	a1.add(20.8);
	a1.add("Alphabets");
	a1.add(7);
	System.out.println("**The Alphabet object from the ArrayList**");
for (int i = 0; i < a1.size(); i++) {
	Object obj=a1.get(i);
	if (obj instanceof String) {
		String s=(String)obj;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j)>='a'||s.charAt(j)>='A') {
				System.out.print(s.charAt(j));
			}
		}}}}}
