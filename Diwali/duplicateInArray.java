package Diwali;

import java.util.Arrays;

import java.util.HashSet;

public class duplicateInArray {
	
	public static boolean containsDuplicate(int[] nums) {
	     Arrays.sort(nums);
	     for (int i = 0; i < nums.length - 1; ++i) {
	         if (nums[i] == nums[i + 1]) return true;
	     }
	     return false;
	 }
	
	public static boolean containsDuplicateUsingSet(int arr[]) {
		HashSet <Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				return true;}
			set.add(arr[i]);
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2};

		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicateUsingSet(arr));

	}

}
