package krishnaSundeep;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		int [] arr= {10,30,50,15,25,35,45,40};
		int sum=50;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==(sum-arr[i])) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
