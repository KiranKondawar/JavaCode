package kfintech;

public class threeSum {
	static void printArr(int [] arr,int sum) {
		for(int a=0;a<arr.length-2;a++) {
			for(int b=a+1;b<arr.length-1;b++) {
				for(int c=b+1;c<arr.length;c++) {
					if(arr[a]+arr[b]+arr[c]==sum) {
						System.out.println("sum no are {"+ arr[a]+arr[b]+arr[c]+"}" );
					//return true;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] arr= {1,2,4,5,9,3,7,6};
		int sum=10;
		printArr(arr,sum);

	}

}
