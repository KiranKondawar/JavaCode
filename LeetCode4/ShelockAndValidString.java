package LeetCode4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShelockAndValidString {
	
	public static boolean isValid(String str) {
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
		char c=str.charAt(i);
		int freq=map.getOrDefault(c,0);
		map.put(c, ++freq);
		
		}
		
		int arr[]=new int[map.size()];
		int idx=0;
		for(Map.Entry<Character, Integer> CharMap:map.entrySet()) {
			arr[idx]=CharMap.getValue();
		}
		
		Arrays.sort(arr);
		
		int first=arr[0];
		int second=arr[1];
		int secondLast=arr[arr.length-2];
		int last=arr[arr.length-1];
		
		//if all value are same then its pass case
		if(first == last)
			return true;
		// if first is 1 and balance alll are same then also true
		
		if(first==1 && second==last){
			return true;
			
		// if last is only 1 more than second last
			
		
		}
		
		if(first==second && second == secondLast && secondLast==(last-1))
			return true;
		return false;
	}

	public static void main(String[] args) {
		String str="AABBCCDDE";
		System.out.println(isValid(str));

	}

}
