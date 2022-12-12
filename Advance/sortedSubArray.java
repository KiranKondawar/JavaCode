package Advance;

public class sortedSubArray {

	public static void main(String [] args) {
		int[] arr= {7,10,4,1,2,4,5,8,0,9,16};
		int high=0;
		int low=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				high++;
			}else {
				low++;
			}
			
		
		}System.out.println(high+" "+low);
	}
}
