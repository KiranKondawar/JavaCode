package krishnaSundeep;

public class nextGreaterElement {
	private static void printNextGreaterElement(int[] arr) {
		int i,j,next;
		for(i=0;i<arr.length;i++) {
			next=-1;
			for(j=i+1;j<arr.length;j++) {
				
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+" "+next);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {11,22,13,14};
		printNextGreaterElement(arr);

	}
	

}
