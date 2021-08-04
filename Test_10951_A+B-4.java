import java.util.Scanner;

public class Test10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// while문을 써서 계속 반복
		// hasNextInt = 다음 int값이 유효할때 true - 만약 다음 입력 값이 없다면 while문 종료
    
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
