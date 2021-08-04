package codingTest;

import java.util.Scanner;

public class Test10807 {

	public static void main(String[] args) {
		// 조건 : 배열 크기 N, 배열 값, 조회할 값 V, count

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 첫째 줄 입력
		
		int numbers [] = new int [N];
		int count = 0;
		
		for(int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt(); // 둘째 줄 입력
		}
		
		int V = sc.nextInt();		// 셋째 줄 입력
		for(int i = 0; i < numbers.length; i++) {
		if(V == numbers[i]){
				count++;
			}
		}
			System.out.println(count);
	}
		
}

// 11
// 1 4 1 2 4 2 4 2 3 4 4
// 2
