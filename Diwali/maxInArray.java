package Diwali;

import java.util.Arrays;

public class maxInArray {
	


	public static void main(String[] args) {
		int arr[]= {1,2,3,45,64,85,6};
		 int max_val = Arrays.stream(arr).max().getAsInt();
		 System.out.println(max_val);
		 int min_val = Arrays.stream(arr).min().getAsInt();
		 System.out.println(min_val);
	}

}
