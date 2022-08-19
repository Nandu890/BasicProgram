package section3;//To find the maximum value in Array

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int war = arr[0];
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > war) {
				war = arr[i];
			}
		}
		System.out.println("This is the maximum number in array element::" + war);
	}
}
