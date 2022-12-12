package Diwali;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSumTarget(int arr[], int tar) {
             int res[]=new int[2];
             HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
             for(int i=0;i<arr.length;i++) {
            	 int diff=tar-arr[i];
            	 if(map.containsKey(diff)) {
            		 res[0]=i;
            		 res[1]=map.get(diff);
            		 return res;
            	 }
            	 map.put(arr[i], i);
             }
             return res;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 11, 12, 13, 14, 15 };
		int target = 25;
		int res[]=twoSumTarget(arr, target);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

}
