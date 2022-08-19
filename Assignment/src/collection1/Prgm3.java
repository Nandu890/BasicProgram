package collection1;//WAP to display all the string object from the arraylist
//which contains letter 'a' in it

import java.util.ArrayList;
public class Prgm3 {
public static void main(String[] args) {

	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(30);
	a1.add("Ramesh");
	a1.add("hi");
	a1.add("hello");
	a1.add("amul");
	a1.add('c');
	a1.add("Rahul"); 
	for (int i = 0; i <a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof String) {
			String str=(String)obj;
			
			char[] strarr=str.toCharArray();
		
			for (int j = 0; j < strarr.length; j++) {
				if (strarr[j]=='a') {
					System.out.println(str);
					
				}}}}}}
			