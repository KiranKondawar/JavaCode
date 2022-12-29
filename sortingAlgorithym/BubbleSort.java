package sortingAlgorithym;

public class BubbleSort {
	public static void swap(int arr[],int a,int b) {
		int temp=arr[a];
		 arr[a]=arr[b];
		 arr[b]=temp;
		
	}
	
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j+1]<arr[j]) {
					swap(arr,j+1,j);
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
	int arr[]= {4,7,3,6,22,2};
	bubbleSort(arr);

	}

}
