package SearchingAlgo;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
      int arr[]= {1,7,6,2,8,3};
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter No to find ");
      int find=Sc.nextInt();
      int last=arr.length;
    int index=linearSearch(arr,0,last,find)  ;
    if(index==-1) {
    	System.out.println("Not found in array");
    }else {
    	System.out.println("index is"+index);
    }
	}

	private static int linearSearch(int[] arr, int i, int last, int find) {
		for(int k=0;k<last;k++) {
			if(arr[k]==find) {
				return k;
			}
		}
		return -1;
		
	}

}
