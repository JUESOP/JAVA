package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a[] = br.readLine().split(" ");
		String a1 = a[0];
		String b1 = a[1];

		String a2 = "";
		String b2 = "";

		for (int i = a1.length() - 1; i >= 0; i--) {
			a2 += a1.charAt(i);
			b2 += b1.charAt(i);
		}
			
		// String -> int 변환
		int a3 = Integer.parseInt(a2);
		int b3 = Integer.parseInt(b2);

		System.out.println(a3 > b3 ? a3 : b3);
		
	}

}
