package code;

import java.util.HashSet;
import java.util.Scanner;

public class T_나머지 {

	public static void main(String[] args) {

		HashSet<Integer> hashset = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			int num = arr[i] % 42;

			hashset.add(num);
		}

		System.out.println(hashset.size());
	}

}
