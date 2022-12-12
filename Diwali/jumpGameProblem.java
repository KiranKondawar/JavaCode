package Diwali;

public class jumpGameProblem {
	
	public static boolean possibleToReachLast(int arr[]) {
		int n= arr.length;
		if(n<=1) return true;
		int lagrestIndex=arr[0];
		
		for(int i=0;i<n;i++) {
			if(lagrestIndex <= 1 && arr[i] ==0) {
				return false;
			}
			if(i+arr[i] > lagrestIndex) {
				lagrestIndex=i+arr[i];
			}
			if(lagrestIndex >= arr.length-1)
				return true;
		}
		
		
		
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {3,2,1,0,4};
		//each element shows no of jumps so here you can reach to last elemant
		// simply by 2jump then 1 then 1 
		//strt always at 0 index
//[3,2,1,0,4]
		//here always m jump will take you to 0 means you cant reach last element
		System.out.println(possibleToReachLast(arr));
		
	}

}
