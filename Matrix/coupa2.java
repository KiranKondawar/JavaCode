package Matrix;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class coupa2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no  ");
		String n=sc.nextLine();
		char arr[]=n.toCharArray();
		
		
//		int[] arr=new int[n];
//		System.out.println("enter the no in arr ");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.next();
//		}
//		
//		int []sortarr= new int [arr.length];
//		for(int i=0;i<sortarr.length;i++) {
//			sortarr[i]=arr[i];
//		}
//		Arrays.sort(sortarr);
//	 for(int i=0;i<sortarr.length;i++) {
//		 System.out.println(sortarr[i]);
//	 }
		int count=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==sortarr[i]) {
			 count++;
			 System.out.println(arr[i]);
		 }
	 }System.out.println(count);
	 
		
	
	}

}