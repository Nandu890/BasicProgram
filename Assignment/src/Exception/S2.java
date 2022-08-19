package Exception;//StringIndexOutOfBoundsException Expection handled by user.

public class S2 {
	public static void main(String[] args) {
		String a="movie";
		System.out.println(a.charAt(0));
		
		try 
		{
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(8));
		}
		catch(StringIndexOutOfBoundsException a1)
		{
			System.out.println(a1.getMessage());
		}
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(4));
		
	}

}

