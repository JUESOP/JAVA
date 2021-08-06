package codingTest;

import java.util.Scanner;

public class T { 

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);                
		String x = sc.nextLine();							// nextLine을 사용하여 문자열을 입력받음
		int a = Integer.parseInt(x);						// 문자열 x를 Integer.parseInt를 사용하여 int형으로 바꿔주고 변수 a에 넣어줌
		
		
		String b[]= new String[a];							// 입력받은 수 a만큼 배열 b를 생성해줌    											
		
		for(int i = 0; i < a; i++) {   						 
	       b[i] = sc.nextLine();
	       String str [] = b[i].split(" ");
	       
		}
		
	
	       
		       for(int j = 1; j < b.length; j++) {
		    	 
		    	   
		    	   double c = 0;
		    	   
		    	   if(b[j] == "@") {
		    		   c = c * 3;
		    	   }
	    		   else if(b[j] == "%") {
		    			   c = c + 5;
		    			   
   		   		} else {
		    			   c = c - 7;
		    		   }
		    	   
		    		   
	    	   }
		    	   
	      }
	}
}

//			double answer = 0.0; 	
//			for(int j=0; j < a.length; j++){
//				a[j] = sc.next();	
//			}

//			for(int j = 1; j < 4; j++) {    	 //1번 인덱스부터 3번 인덱스까지
//				
//				if(a[j] =='@') {
//					answer *= 3;  	 			 //answer = answer * 3;
//				}
//				
//				else if(a[j] =='%') {
//					answer += 5;				//answer = answer + 5;
//				}
//				
//				else if(a[j] == '#'){     // 왜 else를 쓰면 에러가 뜨는지 궁금!!!!!!!
//					answer -= 7;
//				}

//			}

// 반복작업 - for문, while문
// 메서드 하나 만들어서 메서드 호출
// 1. @, %, #을 쓴다.
// 2. @ = x * 3
// 3. % = x + 5
// 4. # = x - 7
// 5. 첫째 자리에 숫자, 둘째 짜리부터 연산자가 나옴

//1. 첫째 줄에 테스트 케이스의 개수 T가 주어진다
//2. 다음 줄에는 화성 수학식이 한 줄에 하나씩 주어진다.
//3. 맨 처음에는 정수나 실수가 올 수 있다.
//4. 가장 앞에 수가 하나 있고 그 다음에는 연산자가 있다.
//5. 연산자는 최대 3개가 주어진다.
