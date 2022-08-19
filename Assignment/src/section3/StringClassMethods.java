 package section3;

public class StringClassMethods {
	public static void main(String[] args) {
		String s1="mohana";
		String s2="KUMARI";
		String s3="hi chinna how are you";
		String s4="qspiders";
		
		System.out.println(s1.length());//Returns the length of this string.The length is equal to the number of Unicodecode units in the string.
		//Specified by: length() in CharSequence
		//Returns:the length of the sequence of characters represented by thisobject.
		
		System.out.println("to retrive the char from the string");
		for(int i=0;i<s1.length();i++) {
		System.out.println(s1.charAt(i));//Returns the char value at thespecified index. An index ranges from 0 to length() - 1. The first char value of the sequenceis at index 0, the next at index 1,and so on, as for array indexing. 
		}
		
		char[] a=s2.toCharArray();//Converts this string to a new character array.
		//Returns:a newly allocated character array whose length is the lengthof this string and whose contents are initialized to containthe character sequence represented by this string
		for(int i=0;i<s2.length();i++) {
			System.out.println(a[i]);
			}
		
		System.out.println("the index of the char is	"+s1.indexOf('a'));//Returns the index within this string of the first occurrence ofthe specified character. If a character with value ch occurs in the character sequence represented bythis String object, then the index (in Unicodecode units) of the first such occurrence is returned.
		
		System.out.println("the index of the last char is	"+s1.lastIndexOf('n'));//Returns the index within this string of the last occurrence ofthe specified character.
			
		System.out.println("the substring of s1 is  "+s1.substring(1));//Returns a string that is a substring of this string. The substring begins with the character at the specified index andextends to the end of this string. 
		
		System.out.println("the substring of s2 is  "+s2.substring(1, 5));//Returns a string that is a substring of this string
	
		System.out.println("does the string contains spider  "+s4.contains("spider"));//Returns true if and only if this string contains the specifiedsequence of char values.
	
		System.out.println("convert the string to UPPERCASE  "+s1.toUpperCase());//Converts all of the characters in this String to uppercase using the rules of the default locale. This method is equivalent to toUpperCase(Locale.getDefault()). 
	
		System.out.println("convert the string to lowecase "+ s2.toLowerCase());//Converts all of the characters in this String to lowercase using the rules of the default locale. This is equivalent to calling toLowerCase(Locale.getDefault()).
	
		System.out.println(s1.compareTo(s2));//
//Compares two strings lexicographically.The comparison is based on the Unicode value of each character inthe strings. The character sequence represented by this String object is compared lexicographically to thecharacter sequence represented by the argument string. The result isa negative integer if this String objectlexicographically precedes the argument string. The result is apositive integer if this String object lexicographicallyfollows the argument string. The result is zero if the stringsare equal; compareTo returns 0 exactly whenthe equals(Object) method would return true. 
//This is the definition of lexicographic ordering. If two strings aredifferent, then either they have different characters at some indexthat is a valid index for both strings, or their lengths are different,or both.

		System.out.println("to cancat the strings  "+ s2.concat(s4));//Concatenates the specified string to the end of this string. 
	
		System.out.println("to replace the char a by b  "+s1.replace('a', 'b'));//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
	
		System.out.println("to split the strings");
			String[] a1=s3.split(" ");//the array of strings computed by splitting this stringaround matches of the given regular expression
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
	
	
	
	
	
	}}
