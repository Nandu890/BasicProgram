package Exception;//NullPointerException Expection handled by user
public class N2 {
	int a=52;
	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			System.out.println("try block starts");
			N2 a1=null;
			System.out.println(a1.a);
			System.out.println("try block ends");
		}
		catch (NullPointerException b1) 
		{
			System.out.println(b1.getMessage());
		}
		
		System.out.println("main ends");
	}

}
