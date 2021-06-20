package codingTest;

import java.util.Scanner;

public class Test1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Origin = sc.nextInt();
		
		int O = Origin;
		int count = 0;
		
//		do{ O = (O % 10 * 10) + (((O / 10) + (O % 10)) % 10);
//			count++;
//		} while(O != Or);
//		
//		System.out.println(count);
//	}
//
//}
		
		while(true) {
			O = (O % 10 * 10) + (((O / 10) + (O % 10)) % 10);
			count++;
			
			if(O == Origin) {
			break;
			}
			
		}
			System.out.println(count);
	}
	
}
