package code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // 테스트 케이스 수

		for (int i = 0; i < c; i++) { // 테스트 케이스 수 만큼 반복
			int N = sc.nextInt(); // 반복 횟수 입력
			String s = sc.next(); // 문자열 입력

			// 문자열 길이만큼 반복
			for (int j = 0; j < s.length(); j++) { // ex) ABC
				for (int k = 0; k < N; k++) { // 한 글자씩 N번 반복
					System.out.print(s.charAt(j));
				}

			}
		}
	}
}
