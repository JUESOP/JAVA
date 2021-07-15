package codingTest;

import java.util.Scanner;

public class T최댓값 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		int max = arr[0];
		int maxindex = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(maxindex);
	}

}
