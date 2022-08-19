package Exception;

import java.util.Scanner;

public class User2 {
	public static void main(String[] args) 
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
			try {
			throw new NotElgibleToMarryException();
			}
			catch (NotElgibleToMarryException e) 
			{
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("end of life");
	}

}
