package code;

import java.util.Scanner;

public class Gogodan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double sum = 0;
		double count = 0;
		
		for (int i = 0; i < c; i++) {
			
			int N = sc.nextInt();
			int arr[] = new int[N];
//			double sum = 0;
			
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			double avg = (sum / N);
//			double count = 0;
			
			for (int j = 0; j < N; j++) {
				
				if (arr[j] > avg) {
					count++;
				}
				
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}

	}
}
