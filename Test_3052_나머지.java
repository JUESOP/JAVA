package code;

import java.util.Scanner;

public class T_숫자의개수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int num = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			num += arr[i] % 42;
		}

		System.out.println(num);

	}

}
