package collection1;///WAP to Display only Prime Object from the ArrayList

import java.util.ArrayList;
public class ALPrgm2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(20);
	a1.add(19);
	a1.add("Ramesh");
	a1.add('i');
	a1.add(20.8);
	a1.add(31);
	a1.add(7);
	
for (int i = 0; i < a1.size(); i++) {
	Object obj=a1.get(i);
	if (obj instanceof Integer) {
		int num=(int)obj;
		int count=0;
		for (int j =1; j <=num; j++) {
			if(num%j==0) {
				count++;
						}}
if (count==2) {
	System.out.println("Prime no. of the ArrayList="+num);
	}
	}}
	}}
