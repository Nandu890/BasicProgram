package section3;//Finding the duplicate value in Array 

public class Q2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 6, 5, 6, 8, 6, 5, 8 };
		System.out.println("The duplicate of Arrya element are");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);

				}
			}
		}
	}
}
