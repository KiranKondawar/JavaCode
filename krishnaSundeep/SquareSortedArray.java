package krishnaSundeep;

public class SquareSortedArray {

	public static void main(String[] args) {
		int arr[]= {-6,-1,2,4,5};
		int squareArray[]=squareSortedArray(arr);
		for(int i: squareArray) {
			System.out.println(i+" ");
		}

	}

	private static int[] squareSortedArray(int[] arr) {
		int squareArray[] =new int [arr.length];
		int start=0;
		int end=arr.length-1;
		int squareIndex=arr.length-1;
		
		while(start<end) {
			if(arr[start]*arr[start]>arr[end]*arr[end]) {
				squareArray[squareIndex--]=arr[start]*arr[start];
			start++;
			}else {
				squareArray[squareIndex--]=arr[end]*arr[end];
				end--;
			}
		}
		
		return squareArray;
	}

}
