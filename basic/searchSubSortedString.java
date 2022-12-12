package basic;

import java.util.Scanner;

public class searchSubSortedString {
	
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=Sc.next();
	
	


public static int[] sortedSubArray(int[] arr) {
	// 5,1,2,3,6
	int left = 0, right = 0;
	int[] max = { left, right };
	for (int i = 1; i < arr.length; i++) {
		if (arr[i] > arr[right])
			right++;
		else {
			left = i;
			right = i;
		}
		if (right - left > max[1] - max[0])
			max = new int[] { left, right };
	}
	return max;

}
}