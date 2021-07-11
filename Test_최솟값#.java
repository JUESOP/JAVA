// 프로그래머스

import java.util.Arrays;
import java.util.Collections;

public class T {
    public static void main(String[] args) {
        int A[] = {1,2};
        int B[] = {3,4};

        int answer = 0;
      
        // A, B 오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){

            answer += A[i] * B[A.length -i - 1];

        }
        System.out.println(answer);
