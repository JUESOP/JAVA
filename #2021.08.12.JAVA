3번부터 다시 해야함 

package CodingTest;

import java.util.Scanner;

public class Main1 { 

	public static void main(String[] args) {
  
	/*
		  1. String 배열 
      2. split으로 쪼개기 
      3. for문 돌려서 한글자씩 비교하기 
      4. 앞에 나온 문자가 하나 더 나오면 count안함
	 */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String arr[] = new String[N]; // N개의 배열이 생성됨
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
			String sp[] = arr[i].split("");
		}

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < arr.length; j++) {

			}
		}

		System.out.println(arr[2].length());

	}

}
