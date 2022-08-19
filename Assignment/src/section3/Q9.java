package section3;//remove the duplicate character from the string

public class Q9 {
public static void main(String[] args) {
	String s="aabbccddee";
	removeDuplicate(s);
}
public static void removeDuplicate(String s)
{
	String n= new String(); 
		for(int i=0;i<s.length();i++) {
		char character=s.charAt(i);
		if (n.indexOf(character)<0) {
			n +=character;
		}}
		System.out.println(n);}} 


