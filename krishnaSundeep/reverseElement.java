package krishnaSundeep;
import java.util.Stack; 

public class reverseElement {

	public static void main(String[] args) {
	
		Stack stack=new Stack();
		int arr[]= {1,2,4,6,7,8};
		
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int) stack.pop();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
