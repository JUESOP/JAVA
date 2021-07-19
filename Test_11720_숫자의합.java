package codingTest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = sc.next();
		String[] ar = a.split("");
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			int s = Integer.parseInt(ar[i]);
			sum += s;
		}
		System.out.println(sum);
	}
}
