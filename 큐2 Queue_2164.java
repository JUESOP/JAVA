package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test2164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 	// ex: N=6

		// Queue<자료형> Queue명 = new LinkedList<자료형>(크기);
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			q.offer(i);	// ex: 1,2,3,4,5,6
		}

		while (q.size() != 1) {
			q.poll(); // 가장 위에 있는걸 제거한다.
			q.offer(q.poll()); // 그 다음 위에 있는 걸 맨 뒤로 옮긴다.
		}

		System.out.println(q.poll()); // 카드가 한장 남았을 때 그 카드 출력
	}
}
