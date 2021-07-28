package code;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x[] = new int[3]; // x좌표 배열 3개 생성
		int y[] = new int[3]; // y좌표 배열 3개 생성

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		int x1 = 0; 
		int y1 = 0; // 찾고자 하는 좌표
		if (x[0] == x[1]) {
			x1 = x[2];
		} else if (x[0] == x[2]) {
			x1 = x[1];
		} else if (x[1] == x[2]) {
			x1 = x[0];
		}

		if (y[0] == y[1]) {
			y1 = y[2];
		} else if (y[0] == y[2]) {
			y1 = y[1];
		} else if (y[1] == y[2]) {
			y1 = y[0];
		}

		System.out.println(x1 + " " + y1);
	}

}
