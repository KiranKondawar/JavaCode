package Diwali;

import java.util.Arrays;

public class mapTriplateMul {
	public static void mul(int [] arr) {
		int max=0;
		int n=arr.length;
		Arrays.sort(arr);
		
		if(n <= 2) {
			System.out.println("No triplet exits.The array has less than 3 elements");
		}
		
		if(arr[0]*arr[1]*arr[2] < arr[n-1]*arr[n-2]*arr[n-3]){
			System.out.printf("triplet is(%d,%d,%d)",arr[n-1],arr[n-2],arr[n-3]);
		}
		else {
			System.out.printf("triplet is(%d,%d,%d)",arr[0],arr[1],arr[2]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {-1,2,3,4,-6};
		mul(arr);
	}

}
