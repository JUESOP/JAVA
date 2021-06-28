package codingTest;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();       			 // 문자열로 입력 받음
		char[] b = x.toCharArray();		 			 // 문자열을 char로 변환, b라는 배열 생성
		
		int answer = 0;
		
		int c[] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10}; //c배열을 생성하여 차례대로 숫자를 넣어줌
		
		for(int i = 0; i < b.length; i++) {
			
			int d = 0;									
			d = b[i] - 65;  				 // d는 입력받은 알파벳 문자를 정수로 바꿔준 것 (65를 빼서 char -> int로 바꿔줌)
			 
			 answer += c[d];				 // d를 c의 인덱스 자리에 넣어줌 , answer에 저장
			 
		}
		
		System.out.println(answer);
			
	}
	
}
		

