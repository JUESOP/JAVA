package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test2164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// Queue<자료형> Queue명 = new LinkedList<자료형>(크기);
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		while (true) {
			q.poll();
			q.offer(q.poll());

			if (q.size() == 1) {
				break;
			}
		}
		
		System.out.println(q.poll());
	}

}
