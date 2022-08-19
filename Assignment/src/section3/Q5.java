package section3;//Check given String is Palindrome or not

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value");
		String s = sc.next();
		StringBuffer pal = new StringBuffer(s);
		StringBuffer kal = new StringBuffer();
		System.out.println(pal);

		for (int i = pal.length() - 1; i > 0; i--)
			kal.append(pal.charAt(i));
		String s1 = kal.toString();
//		pal.reverse();
//		String s1=pal.toString();
		if (s.equals(s1)) {
			System.out.println("The String is Palindrome =" + s);
		} else {
			System.out.println("The String is not palindrome =" + s);
		}
	}

}
