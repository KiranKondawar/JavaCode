package basic;

public class loop {
	public static void main (String [] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length;
		for (int s = 0; s < n-1; s++)
	      {
	        if (arr[s] > arr[s+1])
	          break;
	        
	      }
		
	}

}
