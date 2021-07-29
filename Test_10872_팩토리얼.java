import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 1;

		if (N != 0) {
			for (int i = N; i > 0; i--) {
				sum *= i;
			} System.out.println(sum);
		} else {
			System.out.println(1);
		}

	}
}
