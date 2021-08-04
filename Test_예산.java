package codingTest;

import java.util.Arrays;

public class T {

	public static void main(String[] args) {
		
		int d[] = {1,3,2,5,4}; 
		int budget = 9;
		int count = 0;
		int sum = 0;
		
		Arrays.sort(d);  // d = {1,2,3,4,5}
		
		for(int i=0; i<d.length; i++) {  // d의 길이 만큼 돌려줌
			sum += d[i];
			
			 if(budget - sum < 0){
				 break;
			 }
			count++; 
		}
		System.out.println(count);
	}

}
