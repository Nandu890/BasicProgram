package Exception;//Exception propagation and throw exception
public class Throw {
public static void main(String[] args) {
	System.out.println("main starts");
	try {
	throw new ClassCastException("Exception in main");
	}catch (Exception a) {
	System.out.println(a.getMessage());
	}m1();
	System.out.println("main ends");
	
	
}
	public static void m1() {
	System.out.println("m1 starts");
	try {
	throw new NullPointerException("Exception in m1");
	}catch (Exception a) {
	System.out.println(a.getMessage());	
	}m2();
	System.out.println("m1 ends");
	
}
public static void m2() {
	System.out.println("m2 starts");
	try {	
	throw new ArrayIndexOutOfBoundsException ("Exception in m2");
	}catch (Exception b) {
	System.out.println(b.getMessage());
	}m3();
	System.out.println("m2 ends");
	
}
public static void m3() {
	System.out.println("m3 starts");
	try {
	throw new ArithmeticException ("/ by zero");
	}catch (ArithmeticException c) {
	System.out.println(c.getMessage());	
	}
	System.out.println("m3 ends");
}
}
