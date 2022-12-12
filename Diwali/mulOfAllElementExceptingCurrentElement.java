package Diwali;

public class mulOfAllElementExceptingCurrentElement {
	
	public static int[] malArr(int arr[]) {
		int res[]=new int [arr.length];
		int left_Product[]=new int[arr.length];
		int right_Product[]=new int[arr.length];
		
		left_Product[0]=1;
		right_Product[arr.length-1]=1;
		
		for(int i=1;i<arr.length;i++) {
			left_Product[i]=arr[i-1]*left_Product[i-1];
		}
		for(int i=arr.length-2;i>=0;i--) {
			right_Product[i]=arr[i+1]*right_Product[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			res[i]=left_Product[i]*right_Product[i];
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		
		int [] res=malArr(arr);
		System.out.print ('[');
		for(int i=0;i<res.length;i++) {
			System.out.print (res[i]+" ");
		}
		System.out.print (']');

	}

}
