package Diwali;

public class maxSumOfNonAdjecedntElement {
	public static int maxSum(int [] arr) {
		
		int len=arr.length;
		if(len==0) {
			return 0;
		}
		if(len==1) {
		return arr[0];
		}
		//Take array of same lenght
		int [] dp=new int [len];
		dp[0]=arr[0];
		dp[1]=(arr[0]>arr[1])?arr[0]:arr[1];
		
		for(int i=2;i<len;i++) {
			dp[i]=Math.max(dp[i-1], dp[i-2]+arr[i]);
		}
		return dp[len-1];
		
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(maxSum(arr));
	}

}
