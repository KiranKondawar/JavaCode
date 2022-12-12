package LeetCode4;

public class oddEven {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println(oddEvenProduct(arr));

	}

	private static int oddEvenProduct(int[] arr) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int mul=1;
		
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			mul *=arr[i];
		}
		
		if(sum %2==0 || sum ==0) {
			return sum;
		}else
		return sum;
	}

}
