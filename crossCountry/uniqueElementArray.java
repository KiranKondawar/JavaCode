package crossCountry;

import java.util.Arrays;

public class uniqueElementArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,3,2};
		Arrays.sort(arr);
		uniuqeEle(arr);

	}

	private static void uniuqeEle(int[] arr) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		boolean flag=false;
		
		for(int k=0;k<i;k++) {
			if(arr[i]==arr[k]) {
				flag=true;
				break;
			}
		}
		if(!flag) {
		System.out.println(arr[i]);
		}
	}
		
	}

}
