package Exception;
import java.util.Scanner;
public class Prgm1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1 ");
		String s1=sc.nextLine();
		String s2="hi how are you,had tea";
		System.out.println("replaced char h-b  ::"+s1.replace('h', 'b'));
		
		String[]arr=s1.split(" ");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
		{ System.out.println(arr[i]);}
		System.out.println(s1.split(s2));
		}
	
	}


