package section3;//swap 2variables without using 3rd keyword 

public class Q10 {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("'a'value is="+a);
		System.out.println("'b value is="+b);
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		System.out.println("'a' swap value is="+a);
		System.out.println("'b swap value is="+b);
	}
}
