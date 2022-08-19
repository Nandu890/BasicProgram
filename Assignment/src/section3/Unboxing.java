package section3;

public class Unboxing {

	

	public static void main(String[] args) {
		int a=10,x=60;
		
	Integer b=x;//Implicit boxing
	System.out.println(b);
	
	Integer c=Integer.valueOf(a);//Explicit boxing
	System.out.println(c);

	int d=c;//Implicit unboxing
	System.out.println(d);
	
	int e =c.valueOf(a);
	System.out.println(e);
	
	int f=b.intValue();//Explicit unboxing
	System.out.println(f);

	}

}
