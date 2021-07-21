package code;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String a[] = A.split("");

		String B = sc.next();
		String b[] = B.split("");

		String a1 = "";
		String b1 = "";

		for (int i = a.length - 1; i >= 0; i--) {
			// System.out.print(Integer.parseInt(a[i]));
			a1 += a[i];
		}

		for (int i = b.length - 1; i >= 0; i--) {
			// System.out.print(Integer.parseInt(b[i]));
			b1 += b[i];
		}

		if (Integer.parseInt(a1) > Integer.parseInt(b1)) {
			System.out.print(a1);
		} else {
			System.out.print(b1);
		}

	}

}
