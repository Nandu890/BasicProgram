package section3;//Separate Alphabets/numeric constants in given String

import java.util.Scanner; 
public class Q6 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.next();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)<='z' && s.charAt(i)>='a') {

			System.out.println("Alphabet Char of the String	="+s.charAt(i));	
		}
		else if (s.charAt(i)>=0 ||s.charAt(i)>' '||s.charAt(i)=='@'||s.charAt(i)=='#') {
		System.out.println("Numeric/special Char of the String	=" +s.charAt(i));
		}
	}
}

}
