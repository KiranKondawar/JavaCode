package sortingAlgorithym;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for(int k=1;k<arr.length;k++) {
			int current=arr[k];
			int j=k-1;
			while(j>=0 && current < arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}

	public static void main(String[] args) {
	int arr[]= {2,7,8,3,1};
	insertionSort(arr);

	}

}
