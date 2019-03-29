package myownpractice;

public class Application {
	public static void main(String s[]) {

		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r = 1; r <=6; r++) {
			for (int c=5; c>r; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}