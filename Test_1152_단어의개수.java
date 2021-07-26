package code;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine().trim();
		String arr[] = a.split(" ");

		if (a.isEmpty()) { // a가 비어있다면 0 출력
			System.out.println(0);
		} else {
			System.out.println(arr.length);
		}
	}

}
