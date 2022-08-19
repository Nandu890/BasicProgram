package collection1;////WAP to Display only Palindrome Object from the ArrayList.

import java.util.ArrayList;

public class ALPrgm3 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(191);
		a1.add("Ramesh");
		a1.add('i');
		a1.add(20.8);
		a1.add(121);
		a1.add(7);
		
	for (int i = 0; i < a1.size(); i++) {
		Object obj=a1.get(i);
		if (obj instanceof Integer) {
			int num=(int)obj;
			int rem=0,sum=0,tmp=num;
			while(num>0){
				rem=num%10;
				sum=(sum*10)+rem;
				num=num/10;
			}
			if(sum==tmp) {
				System.out.println("Palindrome integer object="+tmp);
			}}}}}
