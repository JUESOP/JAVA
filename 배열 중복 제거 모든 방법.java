package codingTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test10870 {

	public static void main(String[] args) {

	// 자바 배열 중복 제거 모든 방법
  
		 // 방법 1. ArrayList
     
		int[] pkm = {2,2,2,3,3,3};					
		ArrayList<Integer> arraylist = new ArrayList<>();
		
		for(int item : pkm) {
			if(!arraylist.contains(item))
				arraylist.add(item);
		}
		
		System.out.println(arraylist); 
		
		
		  // 방법 2. HashSet 중복x, 순서x
		
		int[] pkm = {2,2,2,3,3,3};
		HashSet<Integer> hashset = new HashSet<>();
		
		for(int item : pkm) {
			hashset.add(item);
		}
		
		System.out.println(hashset); 
		
		
		   // 방법 3. LinkedHashSet 중복x, 순서o
		
		int[] pkm = {2,2,2,3,3,3};
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
		
		for(int item : pkm) {
			linkedhashset.add(item);
		}
		 
		System.out.println(linkedhashset);
    
	}

}
