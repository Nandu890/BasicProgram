package section3;

public class boxing {
	
	public static void main(String[] args) {
		int a=10;
	Integer b=a;//Implicit boxing
	System.out.println(b);
	
	Integer c=Integer.valueOf(a);//Explicit boxing
	System.out.println(c);
	}

}
