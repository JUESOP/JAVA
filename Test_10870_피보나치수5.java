package codingTest;

import java.util.Scanner;

public class Test10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int arr [] = new int[N+2];
		arr[0] = 0;
		arr[1] = 1;

		
		for(int i = 2; i <= N; i++) {
		 arr[i] = arr[i-2] + arr[i-1];
			
		}
		
		System.out.println(arr[N]);
	} 
}
