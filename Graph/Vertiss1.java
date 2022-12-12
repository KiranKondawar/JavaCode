package Graph;

import java.util.Arrays;

public class Vertiss1 {
	
		public int getSum(int N, int[]A, int[]B){
	
	int[] dp = new int[N + 1];
	int sum = 0;

	for (int i = 0; i < A.length; i++) {
	    dp[A[i]]++;
	    System.out.println(dp[A[i]]);
	    dp[B[i]]++;
	}
	 

	 Arrays.sort(dp);
	for (int j = dp.length - 1; j > 0; j--) {
	    sum += dp[j] * j;
	}
	return sum;
		}

	public static void main(String[] args) {
		int []A= {2,1};
		int []b= {4,3};
		int N=4;
		Vertiss1 v1= new Vertiss1();
		System.out.println(v1.getSum(N,A,b));
	}

}
