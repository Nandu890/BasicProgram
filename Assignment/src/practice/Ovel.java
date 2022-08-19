package practice;

public class Ovel {
	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int present = 0;
		for (int i = 0; i < alpha.length(); i++) {
			if (alpha.charAt(i) == 'a' || alpha.charAt(i) == 'e' || alpha.charAt(i) == 'i' || alpha.charAt(i) == 'o'
					|| alpha.charAt(i) == 'u') {
				present++;
			}
		}
		if (present >= 0) {
			System.out.println("The String contains Ovels::      " + alpha);
		} else {
			System.out.println("The String does not contains Ovels::      " + alpha);

		}
	}
}
