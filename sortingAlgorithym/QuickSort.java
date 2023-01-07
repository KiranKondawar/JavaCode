package sortingAlgorithym;

public class QuickSort {
	// In this 2 Basic Parts
	// pivot and partition
	public static int partition(int arr[],int low,int high) {
		int i=low-1;
		int pivot=arr[high];
		
		for(int k=low;k<high;k++) {
			if(arr[k]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		
		return i;
	}

	public static void quickSort(int arr[], int low, int high) {
             if(low<high) {
            	 int pindex=partition(arr,low,high);
            	 
            	 quickSort(arr,low,pindex-1);
            	 quickSort(arr,pindex+1,high);
            	 
             }
	}

	public static void main(String[] args) {
		int arr[] = { 4, 9, 7, 5, 3, 6 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);

		// printing
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
