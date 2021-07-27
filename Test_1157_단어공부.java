package codingTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.next().toUpperCase(); // 입력받은 문자열을 모두 대문자로 변환
		int count[] = new int[26]; // count 배열에 알파벳을 순서대로 다 넣음
		int max = 0; // 최댓값
		char answer = ' '; // 결과값

		for (int i = 0; i < st.length(); i++) {
			count[st.charAt(i) - 'A']++; // char -> int 변환하기 위해 A를 빼줌
			if (max < count[st.charAt(i) - 'A']) {
				max = count[st.charAt(i) - 'A'];
				answer = st.charAt(i);
			} else if (max == count[st.charAt(i) - 'A']) {
				answer = '?';
			}
		}
		System.out.println(answer); 
	} 
}
