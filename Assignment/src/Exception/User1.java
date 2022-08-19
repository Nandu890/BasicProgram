package Exception;

import java.util.Scanner;

public class User1 {
	public static void main(String[] args) throws NotElgibleToMarryException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Gender(m/f)");
		char gender=sc.next().charAt(0);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if ((gender=='m' && age>=21)||(gender=='f' && age>=21))
		{
			System.out.println("Happy married life");
			
		} else {
			throw new NotElgibleToMarryException();
		}
		System.out.println("end of life");
	}

}
