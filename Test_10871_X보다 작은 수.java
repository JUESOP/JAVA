package codingTest;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;

		for (int i = 0; i < a; i++) {
			c = sc.nextInt();

			if (c < b) {
				System.out.print(c + " ");
			}
		}
	}
}
