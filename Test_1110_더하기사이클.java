package codingTest; 

import java.util.Scanner;

public class Test1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		
		int N = Number;
		int count = 0;
        
        while(true) {
			N = (N % 10 * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if(N == Number) {
			break;
			}
			
		}
			System.out.println(count);
	}
	
}
//	------------------------------------------------------- do while 문---------------------------------------------------------

//    	do{ N = (N % 10 * 10) + (((N / 10) + (N % 10)) % 10);
//			count++;
//	    } while(N != Number);
		
//		System.out.println(count);
//	}

//}
