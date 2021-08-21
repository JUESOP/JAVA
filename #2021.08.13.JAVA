package CodingTest;

import java.util.Scanner;
 
public class Main1 {

	public static void main(String[] args) { 
		/*
		 * 1. String 배열 2. split으로 쪼개기 3. for문 돌려서 한글자씩 비교하기 4. 앞에 나온 문자가 하나 더 나오면
		 * count안함
		 */ 
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String arr[] = new String[N]; // N개의 배열이 생성됨
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();

		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			String sp[] = arr[i].split("");

			for (int j = 0; j < arr.length - 1; j++) {

				if (sp[j].equals(arr.length - 1)) {
					break;
				} else if (sp[j].equals(sp[j + 1])) {
					count++;
				} else {
					count++;
				}

			}

		}
		System.out.println(count);
	}

}
