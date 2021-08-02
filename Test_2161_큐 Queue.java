// 보관한 값 꺼내고 반환 - poll()
// 순차보관 - offer() 

package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test2161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    
    // Queue<자료형> Queue명 = new LinkedList<자료형>(크기);
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++)
			q.offer(i); 

		while (!q.isEmpty()) { // 큐가 비어있지 않을 때 반복
			int num1 = q.poll(); // 젤 위에 있는 카드 빼내고 num1에 저장
			System.out.print(num1 + " "); // 젤 위에 카드 출력
			
			if (q.isEmpty()) // 큐가 비어있으면 => 중단
				break;
			
			int num2 = q.poll(); // 두 번째로 위에 있는 카드 빼내고 num2에 저장
			q.offer(num2); // 빼낸 카드 다시 큐에 넣기
		}

	}
}
