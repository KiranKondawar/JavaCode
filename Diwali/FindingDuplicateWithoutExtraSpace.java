package Diwali;

import java.util.*;

public class FindingDuplicateWithoutExtraSpace {

	public static List<Integer> findDuplicates(int arr[]) {
		List<Integer> op = new ArrayList();
          for(int i=0;i<arr.length;i++) {
        	  int index=Math.abs(arr[i])-1;
        	  if(arr[index] < 0)
        		  op.add(index+1);
        	  arr[index]=-arr[index];
        	  
          }
		return op;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDuplicates(arr));

	}

}
