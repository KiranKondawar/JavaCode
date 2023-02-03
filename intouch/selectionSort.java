package intouch;

public class selectionSort {

	public static void main(String[] args) {
		int arr[]= {1,2,5,7,6,3};
		
		selectionSorting(arr);

	}

	private static void selectionSorting(int[] arr) {
		
		for(int a=0;a<arr.length-1;a++) {
			int smallest=a;
			for(int b=a+1;b<arr.length;b++) {
				if(arr[b]<arr[smallest]) {
					smallest=b;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[a];
			arr[a]=temp;
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}
		
	}

}
