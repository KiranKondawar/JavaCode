package Diwali;

public class moveAllZeroToEnd {
	public static void moveToEnd(int arr[]) {
		int count=0;
		int n=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
			count++;
			}
			
		}
		while(count<n) {
			arr[count]=0;
			count++;
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {13,0,1,0,1,0,1,0};
		
		moveToEnd(arr);
		

	}

}
