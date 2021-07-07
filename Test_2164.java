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
		for (int i = 1; i < N; i++) {
			q.offer(i);
		}

		int num1 = 0;
		while (q.size() != 1) {
			num1 = q.poll();
			q.offer(q.poll());
		}
		System.out.println(num1);

	}

}
