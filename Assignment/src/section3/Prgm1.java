package section3;

public class Prgm1 {

	public static void main(String[] args) {
		String s = "hi hello";

		String a = s;// Implicit unboxing
		System.out.println(a);

		String b = s.valueOf(s);// Explicit unboxing
		System.out.println(b);

		String c = a;// Implicit boxing
		System.out.println(c);

		String d = String.valueOf(a);// Explicit boxing
		System.out.println(d);

	}

}
