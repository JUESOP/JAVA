package code;

import java.util.Scanner;

public class Gogodan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		for (int i = 97; i <= 122; i++) {
			System.out.print(N.indexOf((char)i) + " "); 
		}

	}
}
