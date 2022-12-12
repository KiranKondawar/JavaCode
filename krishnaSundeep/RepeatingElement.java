package krishnaSundeep;

public class RepeatingElement {

	public static void main(String[] args) {
		int [] arr= {1,3,3};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max){
				max=arr[i];
			}
		}
		
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++) {
			if(temp[arr[i]]==1) {
				System.out.println(arr[i]);
			}
			else {
				temp[arr[i]]++;
			}
		}
		
			System.out.println(temp);
	
		
		
	}

}	