package krishnaSundeep;

public class LeftRotateByOne {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		
		for(int i: arr) {
			System.out.println(i);
		}

	}

}
