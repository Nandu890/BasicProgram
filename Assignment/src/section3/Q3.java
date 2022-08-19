package section3;//Set the Array in Ascending order

public class Q3 {
	public static void main(String[] args) {

		int[] arr = new int[] { 554, 6, 66, 895, 4 };

		for (int i = 0; i < arr.length; i++) {
			int loc;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					loc = arr[i];
					arr[i] = arr[j];
					arr[j] = loc;
				}
			}
		}
		System.out.println("The Array in Ascending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
