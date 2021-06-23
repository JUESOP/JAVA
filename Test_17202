package codingTest;

import java.util.Scanner;

public class Test17202 {

	public static void main(String[] args) {                //      * 설명 *
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();								// A, B의 입력 값 스캐너 선언 (문자열 타입으로)
		String B = sc.next(); 
		String answer = "";  								// 전역 변수 선언
		String laptop = "";	 								// 전역 변수 선언
		
		for(int i=0; i<8; i++) { 							// 8번 돌아감
			
				answer += A.charAt(i);  					// A에 있는 문자 하나씩 가져옴
				answer += B.charAt(i);  					// B에 있는 문자 하나씩 가져옴
		}													// -> 번갈아 가면서 answer에 담아줌
		
				for(int i=16; i > 2; i--) {	 				// A의 전화번호 8자리, B의 전화번호 8자리 -> i=16부터 시작 
															// 마지막 답인 정수 두 개만 나올 때 까지 돌려줌
							laptop = ""; 					// 빈 공백으로 초기화 시켜줌			
					for(int j=0; j < i-1; j++) {  			// 돌릴때마다 배열 수(크기)가 1씩 감소해야함
						 
						laptop += ((answer.charAt(j)-48) + (answer.charAt(j+1)-48)) % 10; 
						
						// j번째와 j+1번째 숫자들을 더해줘서 laptop 변수에 넣어줌, '% 10' 하는 이유 문제에 설명!!
						// char타입을 int타입으로 변환하려면 -> char형의 값에서 0의 아스키 값인 48을 빼주면 순수한 숫자를 얻을 수 있음
					}
					
					answer = laptop; 						// laptop에 담긴 숫자들을 answer에 넣어줌
		}
				System.out.println(answer);		 		    // answer 출력함
		}
			
	}

		

		
// A에 0부터 9까지의 8자리 숫자가 들어가야 한다.
// B에 0부터 9까지의 8자리 숫자가 들어가야 한다. 우리가 입력

// A랑 B에 있는 숫자 각 한 개씩 번갈아 가면서 출력이 되어야한다. for문을 사용해서 할듯
// 앞에 두 자리씩 차례대로 더한다. (ex: (첫 번째 수 + 두 번째 수), (세 번째 수 + 네 번째 수)....)
// 만약 더한 숫자가 두 자리 수(십의 자리 숫자)가 나온다면 왼쪽 (십의 자리)수는 제외하고 오른 쪽 (일의 자리)숫자만 가져온다.
// 이렇게 계속 반복 하다가 마지막에 두 개의 정수가 나오면 그 수를 출력한다.
