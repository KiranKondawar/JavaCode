package SearchingAlgo;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[],int s,int e,int f) {
		if(e>=1) {
			int mid=(s+(e-1))/2;
			if(arr[mid]==f) {
				return mid;
				
			}else if(arr[mid]>f){
				return binarySearch(arr,s,mid-1,f);
			}
				else {
					return binarySearch(arr,mid+1,e,f);
				}
			}
		return -1;
		}
	



	public static void main(String[] args) {
		int arr[]= {4,8,6,7,3,1,9,2};
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter No to Search");
		int find=Sc.nextInt();
		int length=arr.length;
		int index=binarySearch(arr,0,length,find);
		System.out.println(index);
	}

}
