package Graph;

public class Elen {
	
	public int deleteMinimum(String s){
	int l = s.length();

    int[] dp = new int[l + 1];
    int bcount = 0;
    for (int i = 0; i < l; i++) {
        if (s.charAt(i) == 'a') {
           
            dp[i + 1] = Math.min(dp[i] + 1, bcount);
        } else {
          
            dp[i + 1] = dp[i];
            bcount++;
        }
    }
    
    return dp[l];
	}

    public static void main(String[] args) {
		int []A= {2,1};
		int []b= {4,3};
		int N=4;
		Vertiss1 v1= new Vertiss1();
		System.out.println(v1.getSum(N,A,b));
	}
}
