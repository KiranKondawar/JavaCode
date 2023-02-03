package intouch;

public class nthHighestNo {

	public static void main(String[] args) {
		int arr[]= {4,5,3,6,1};
		int n=arr.length;
		
		for(int a=0;a<n;a++) {
			for(int b=0;b<n-1-a;b++) {
				if(arr[b+1]<arr[b]) {
					int temp=arr[b+1];
					arr[b+1]=arr[b];
					arr[b]=temp;
				}
			}
		}
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]);
		}

	}

}
