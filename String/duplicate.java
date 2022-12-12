package String;

public class duplicate {

	
public static void main(String[] args) {
    String str="1 2 3 4 4 7";
    String[] arr=str.split(" ");
    for(int i=0;i<arr.length-1;i++){
    	for(int j=i+1;j<arr.length-1;j++) {
    		if(arr[i].equals((arr)[j])) {
    			System.out.print(arr[i]);
    		}
    	}
       
    }
}
}
