package Exception;

public class Scb {
	public static void main(String[] args) {
		
		try
		{
			System.out.println(1/0);
		}
		catch (ArrayIndexOutOfBoundsException a1)//Specialized catch block
		{
			
			System.out.println(a1.getMessage());
			
		}
		catch (Exception e) //Generalized catch block
		{
			System.out.println("hi Universe");
			System.out.println(e.getMessage());
		}
	}

}
