package section3;//Check the the given no. is palindrome not. 

public class Q7 {
public static void main(String[] args) {
	int num=121,rem,sum=0,tmp=num;
	while(num>0)
	{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if (tmp==sum) {
		System.out.println("its a palindrome number="+tmp);
	} else {
		System.out.println("its not palindrome number="+tmp);
	}
}
}
