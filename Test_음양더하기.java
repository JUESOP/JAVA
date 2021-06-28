package codingTest;

public class T2 {
	
//Ctrl + Shift + f 정렬
	
	public static void main(String[] args) {
		int arr[] = { 4, 7, 12 };
		Boolean signs[] = { true, false, true };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (signs[i]) {

				sum += arr[i];

			} else {

				sum -= arr[i];
			}
			
		} //for
		
		System.out.println(sum);
	}

}
