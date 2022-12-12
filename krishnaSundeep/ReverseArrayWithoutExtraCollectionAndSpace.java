package krishnaSundeep;

public class ReverseArrayWithoutExtraCollectionAndSpace {

	public static void main(String[] args) {
		int arr[]= {50,40,30,20,10,55};
		
		int low=0;
		int high=arr.length-1;
		
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;high--;
		}
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
