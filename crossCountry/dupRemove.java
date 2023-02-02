package crossCountry;

public class dupRemove {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3};
		int a[]=new int[arr.length];
		
		for(int k=0;k<arr.length-1;k++) {
			boolean flag=false;
			for(int j=k+1;j<arr.length;j++) {
				if(arr[k]==arr[j]) {
					flag=true;
					break;
				}
			}
			
		}

	}

}
