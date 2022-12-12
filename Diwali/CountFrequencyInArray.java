package Diwali;
import java.util.*;

public class CountFrequencyInArray {
	public static void count(int [] arr,int len) {
		int[] res=new int[len];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<len;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> mp:map.entrySet()) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,10,20,30,10,40};
		count(arr,arr.length);
	}

}
