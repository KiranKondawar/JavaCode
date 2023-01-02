package sortingAlgorithym;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		
		for(int k=0;k<arr.length-1;k++) {
			int smallest=k;
			for(int i=k+1;i<arr.length-1;i++) {
				if(arr[smallest]>arr[i] ) {
					smallest=i;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[k];
			arr[k]=temp;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {3,2,7,5,8};
		selectionSort(arr);

	}

}
