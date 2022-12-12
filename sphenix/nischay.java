package sphenix;

public class nischay {
	public static int countDevisible(int arr[]){
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=77) {
				return 0;
			}
			if(arr[i]%7==0) {
				count++;
			}
			
			
		}
		return count;
	}

	 static int count=0;
	public static void main(String[] args) {
		
		int [] arr= {0,7,14,21,28,77};
		int count=countDevisible(arr);
		System.out.println("no are = "+  count );
		
			
		

	
	}
}
