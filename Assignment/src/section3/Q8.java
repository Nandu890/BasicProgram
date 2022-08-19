package section3;//check the given no. is Prime/Composite

public class Q8 {
	public static void main(String[] args) {
		int num=7,count=0;
		for(int i=1;i<=num;i++) {
		if (num%i==0) {
			count++;
		}
		}
		if (count==2) {
			System.out.println("its a prime no.	="+num);
		} else {
			System.out.println("its a composite no. ="+num);

		}
		}
	}
