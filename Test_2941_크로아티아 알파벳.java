import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		
		String a[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for(int i = 0; i <a.length; i++) {
			if(b.contains(a[i])) {
				b = b.replaceAll(a[i], " ");
			}
		}
		
		System.out.println(b.length());
	}
}
