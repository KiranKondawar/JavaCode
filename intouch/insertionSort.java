package intouch;

public class insertionSort {

	public static void main(String[] args) {
		int arr[]= {2,7,8,3,1};
		insertionSort(arr);

	}

	private static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int a=1;a<n;a++) {
			
			int j=a-1;
			int current=arr[a];
			
			while(j>=0 && current < arr[j] ) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=current;
			
		}
		
		for(int a=1;a<n;a++) {
		System.out.print(arr[a]+" ");
		}
		}
		
	}


